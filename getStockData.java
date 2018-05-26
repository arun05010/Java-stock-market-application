package javaapplication1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.csvreader.CsvReader;

public class getStockData {

	public void readCsvToDB(){

		String filePath = "c://1.csv";

		try {
			CsvReader csvReader = new CsvReader(filePath);
			csvReader.readHeaders();
			while (csvReader.readRecord()){
				String created=csvReader.get("created");
				String favoriteCount=csvReader.get("favoriteCount");
				String favorited=csvReader.get("favorited");
				String id=csvReader.get("id");
				String isRetweet=csvReader.get("isRetweet");
				String latitude=csvReader.get("latitude");
				String longitude=csvReader.get("longitude");
				String replyToSID=csvReader.get("replyToSID");
				String replyToSN=csvReader.get("replyToSN");
				String replyToUID=csvReader.get("replyToUID");
				String retweetCount=csvReader.get("retweetCount");
				String retweeted=csvReader.get("retweeted");
				String screenName=csvReader.get("screenName");
				String statusSource=csvReader.get("statusSource");
				String text=csvReader.get("text");
				String truncated=csvReader.get("truncated");
				String[] sqlparam= {created,favoriteCount,favorited,id,isRetweet,latitude,
						longitude,replyToSID,replyToSN,replyToUID,retweetCount,retweeted,
						screenName,statusSource,text,truncated};
				
				addStockData(sqlparam);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addStockData(String[] param) {
		try {
			Connection connect = SetConnection.conn;
			String sql = "insert into Twitter (created,favoriteCount,favorited,id,isRetweet,latitude,"
					+ "longitude,replyToSID,replyToSN,replyToUID,retweetCount,retweeted,screenName,"
					+ "statusSource,text,truncated) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement sta = connect.prepareStatement(sql);

			for(int i=0;i<param.length;i++) {
				sta.setString(i+1, param[i]);
			}
			sta.executeUpdate(sql);
			connect.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
