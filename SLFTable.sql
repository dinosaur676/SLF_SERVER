CREATE DATABASE  IF NOT EXISTS `leefood` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `leefood`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: leefood
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `buy`
--

DROP TABLE IF EXISTS `buy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buy` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `buy_time` varchar(45) NOT NULL,
  `size` int NOT NULL,
  `count` int NOT NULL,
  `price` int NOT NULL,
  `total` int NOT NULL,
  `created_on` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buy`
--

LOCK TABLES `buy` WRITE;
/*!40000 ALTER TABLE `buy` DISABLE KEYS */;
INSERT INTO `buy` VALUES (1,'다경','2023-10-11',12,1000,460,460000,'2023-10-18'),(2,'다경','2023-10-11',12,1000,460,460000,'2023-10-18'),(3,'다경','2023-10-11',12,100,460,46000,'2023-10-18');
/*!40000 ALTER TABLE `buy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chicken_production`
--

DROP TABLE IF EXISTS `chicken_production`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chicken_production` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `parts` varchar(45) NOT NULL,
  `name` varchar(128) NOT NULL,
  `count` double NOT NULL,
  `price` int NOT NULL,
  `total` int NOT NULL,
  `type` varchar(45) NOT NULL,
  `created_on` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chicken_production`
--

LOCK TABLES `chicken_production` WRITE;
/*!40000 ALTER TABLE `chicken_production` DISABLE KEYS */;
/*!40000 ALTER TABLE `chicken_production` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chicken_sell`
--

DROP TABLE IF EXISTS `chicken_sell`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chicken_sell` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `parts` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `count` double NOT NULL,
  `price` int NOT NULL,
  `total` int NOT NULL,
  `created_on` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chicken_sell`
--

LOCK TABLES `chicken_sell` WRITE;
/*!40000 ALTER TABLE `chicken_sell` DISABLE KEYS */;
/*!40000 ALTER TABLE `chicken_sell` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES (6,'다경'),(7,'더조은'),(8,'엄청긴이름테스트'),(9,'ㅁ'),(10,'ㅁㄴ'),(11,'ㅁㄴㅇㄹ'),(12,'ㅁㄴㅇㄹㄹ'),(13,'ㅁㅇㅁ'),(14,'ㅂ'),(15,'ㅈ'),(16,'ㄷ'),(17,'ㄱ'),(18,'ㅅ'),(19,'ㅛ'),(20,'ㅕ');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `price`
--

DROP TABLE IF EXISTS `price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `price` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `market_price` int NOT NULL,
  `loading_price` int NOT NULL,
  `lot_price` int NOT NULL,
  `created_on` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `price`
--

LOCK TABLES `price` WRITE;
/*!40000 ALTER TABLE `price` DISABLE KEYS */;
INSERT INTO `price` VALUES (1,'추가',100,100,100,'2023-10-18'),(2,'추가',150,100,100,'2023-10-10'),(3,'추가',150,100,100,'2023-10-11'),(4,'다경',100,100,100,'2023-10-11');
/*!40000 ALTER TABLE `price` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work`
--

DROP TABLE IF EXISTS `work`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `work` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `work_time` varchar(45) NOT NULL,
  `size` int NOT NULL,
  `count` int NOT NULL,
  `price` int NOT NULL,
  `created_on` varchar(45) NOT NULL,
  `buy_id` bigint NOT NULL,
  `total` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work`
--

LOCK TABLES `work` WRITE;
/*!40000 ALTER TABLE `work` DISABLE KEYS */;
INSERT INTO `work` VALUES (2,'더조은','2023-10-17',12,100,100,'2023-10-18',1,10000),(6,'ㅁ','2023-10-16',12,100,100,'2023-10-18',2,10000),(7,'ㅁㄴㅇㄹ','2023-10-17',12,100,100,'2023-10-18',2,10000),(8,'엄청긴이름테스트','2023-10-17',12,100,100,'2023-10-18',2,10000),(9,'ㅁㄴㅇㄹ','2023-10-16',12,100,100,'2023-10-18',2,10000),(10,'ㅁㄴㅇㄹㄹ','2023-10-17',12,150,100,'2023-10-18',1,15000);
/*!40000 ALTER TABLE `work` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-19 17:49:49
