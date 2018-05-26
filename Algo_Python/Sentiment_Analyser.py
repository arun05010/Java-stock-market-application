import numpy as np
import pandas as pd
from nltk.classify import NaiveBayesClassifier
from nltk.corpus import subjectivity
from nltk.sentiment import SentimentAnalyzer
from nltk.sentiment.util import *

from nltk.sentiment.vader import SentimentIntensityAnalyzer
import unicodedata

data_frame = pd.read_pickle('/Users/arun/Downloads/data/pickled_ten_year_filtered_data.pkl')

# data_frame_1 = data_frame[0:1]
# print data_frame_1['articles']

# changing adj close into prices
data_frame['prices'] = data_frame['adj close'].apply(np.int64)

# selecting the prices and articles
data_frame = data_frame[['prices', 'articles']]
data_frame['articles'] = data_frame['articles'].map(lambda x: x.lstrip('.-'))

# print data_frame['articles']

#print data_frame
df = data_frame[['prices']].copy()

# Adding new columns to the data frame
df["compound"] = ''
df["neg"] = ''
df["neu"] = ''
df["pos"] = ''

#print df
#nltk.download('vader_lexicon')
from nltk.sentiment.vader import SentimentIntensityAnalyzer
import unicodedata
sid = SentimentIntensityAnalyzer()
for date, row in data_frame.T.iteritems():
    try:
        sentence = unicodedata.normalize('NFKD', data_frame.loc[date, 'articles']).encode('ascii','ignore')
        ss = sid.polarity_scores(sentence)
        df.set_value(date, 'compound', ss['compound'])
        df.set_value(date, 'neg', ss['neg'])
        df.set_value(date, 'neu', ss['neu'])
        df.set_value(date, 'pos', ss['pos'])
    except TypeError:
        print data_frame.loc[date, 'articles']
        print date
print df

train_start_date = '2007-01-01'
train_end_date = '2014-12-31'
test_start_date = '2015-01-01'
test_end_date = '2016-12-31'

# train_end_date = '2007-01-20'
# test_start_date = '2007-01-21'
# test_end_date = '2007-01-24'

train = df.ix[train_start_date : train_end_date]
test = df.ix[test_start_date:test_end_date]

sentiment_score_list = []
for date, row in train.T.iteritems():
    sentiment_score = np.asarray([df.loc[date, 'neg'],df.loc[date, 'pos']])
    sentiment_score_list.append(sentiment_score)
numpy_df_train = np.asarray(sentiment_score_list)

sentiment_score_list = []
for date, row in test.T.iteritems():
    sentiment_score = np.asarray([df.loc[date, 'neg'],df.loc[date, 'pos']])
    sentiment_score_list.append(sentiment_score)
numpy_df_test = np.asarray(sentiment_score_list)

y_train = pd.DataFrame(train['prices'])
y_test = pd.DataFrame(test['prices'])

from treeinterpreter import treeinterpreter as ti
from sklearn.tree import DecisionTreeRegressor
from sklearn.ensemble import RandomForestRegressor
from sklearn.metrics import classification_report,confusion_matrix

rf = RandomForestRegressor()
rf.fit(numpy_df_train, y_train)

# print rf.feature_importances_
prediction, bias, contributions = ti.predict(rf, numpy_df_test)

# print prediction
# print contributions

import matplotlib.pyplot as plt

idx = pd.date_range(test_start_date, test_end_date)
predictions_df = pd.DataFrame(data=prediction[0:], index = idx, columns=['prices'])

print predictions_df

predictions_plot = predictions_df.plot()

ax = predictions_df.rename(columns={"prices": "predicted_price"}).plot(title='Random Forest predicted prices 8-2 years')
ax.set_xlabel("Dates")
ax.set_ylabel("Stock Prices")
fig = y_test.rename(columns={"prices": "actual_price"}).plot(ax = ax).get_figure()
fig.savefig("random forest without smoothing.png")

#Smoothing algorithm
from datetime import datetime, timedelta

temp_start_date = test_start_date
average_last_5_days_test = 0
total_days = 10
for i in range(total_days):
    average_last_5_days_test += test.loc[temp_start_date, 'prices']
    # Converting string to date time
    temp_start_date = datetime.strptime(temp_start_date, "%Y-%m-%d").date()
    # Reducing one day from date time
    difference = temp_start_date + timedelta(days=1)
    # Converting again date time to string
    temp_start_date = difference.strftime('%Y-%m-%d')
    #print temp_start_date
average_last_5_days_test = average_last_5_days_test / total_days
print average_last_5_days_test

temp_start_date = test_start_date
average_upcoming_5_days_predicted = 0
for i in range(total_days):
    average_upcoming_5_days_predicted += predictions_df.loc[temp_start_date, 'prices']
    # Converting string to date time
    temp_start_date = datetime.strptime(temp_start_date, "%Y-%m-%d").date()
    # Adding one day from date time
    difference = temp_start_date + timedelta(days=1)
    # Converting again date time to string
    temp_start_date = difference.strftime('%Y-%m-%d')
    print temp_start_date
average_upcoming_5_days_predicted = average_upcoming_5_days_predicted / total_days
print average_upcoming_5_days_predicted
#average train.loc['2013-12-31', 'prices'] - advpredictions_df.loc['2014-01-01', 'prices']
difference_test_predicted_prices = average_last_5_days_test - average_upcoming_5_days_predicted
print difference_test_predicted_prices

predictions_df['prices'] = predictions_df['prices'] + difference_test_predicted_prices
print predictions_df

ax = predictions_df.rename(columns={"prices": "predicted_price"}).plot(title='Random Forest predicted prices 8-2 years after aligning')
ax.set_xlabel("Dates")
ax.set_ylabel("Stock Prices")
fig = y_test.rename(columns={"prices": "actual_price"}).plot(ax = ax).get_figure()
fig.savefig("random forest with aligning.png")