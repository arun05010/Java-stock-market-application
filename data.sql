CREATE DATABASE  IF NOT EXISTS `project` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `project`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.5.38

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `access`
--

DROP TABLE IF EXISTS `access`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `access` (
  `code` int(11) NOT NULL,
  `status` varchar(45) DEFAULT 'UNUSED',
  `user` varchar(45) DEFAULT 'NONE',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `access`
--

LOCK TABLES `access` WRITE;
/*!40000 ALTER TABLE `access` DISABLE KEYS */;
INSERT INTO `access` VALUES (5546,'USED','axvd'),(7100,'UNUSED','NONE');
/*!40000 ALTER TABLE `access` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `twofactor`
--

DROP TABLE IF EXISTS `twofactor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `twofactor` (
  `secretkey` varchar(45) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`secretkey`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `twofactor`
--

LOCK TABLES `twofactor` WRITE;
/*!40000 ALTER TABLE `twofactor` DISABLE KEYS */;
INSERT INTO `twofactor` VALUES ('jk5o xc65 h2j7 7i7o 6pns knuh ndrx iekg','axvd'),('jrh3 z76w zacp vwcp pzzt ig2n dt4o fywt','admin');
/*!40000 ALTER TABLE `twofactor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `sname` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `code` int(11) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `twofactor` varchar(45) DEFAULT 'NO',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('admin','LoI2CeUxi7B3k/EeZ2YJc3jhlgg=','Admin','Admin','',0,'','YES'),('axvd','SIk5INbVJh4gvt1NrPq6QUhdrbA=','axv','axv','034041',5546,'asdasd','YES');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-22 16:09:44


/*Twitter data*/
CREATE TABLE Twitter(
created varchar(45) NOT NULL,
favoriteCount int NOT NULL,
favorited varchar(45) NOT NULL,
id int NOT NULL,
isRetweet varchar(45) NOT NULL,
latitude decimal,
longitude decimal,
replyToSID int,
replyToSN varchar(45),
replyToUID int,
retweetCount int NOT NULL,
retweeted varchar(45) NOT NULL,
screenName varchar(45) NOT NULL,
statusSource varchar(300) NOT NULL,
text varchar(300) NOT NULL,
truncated varchar(45) NOT NULL,
PRIMARY KEY(id)
)




