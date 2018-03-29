CREATE DATABASE  IF NOT EXISTS `intellociplabs` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `intellociplabs`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: intellociplabs
-- ------------------------------------------------------
-- Server version	5.5.49

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
-- Table structure for table `api`
--

DROP TABLE IF EXISTS `api`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `is_active` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `api`
--

LOCK TABLES `api` WRITE;
/*!40000 ALTER TABLE `api` DISABLE KEYS */;
INSERT INTO `api` VALUES ('42543d78-cc49-46bf-9fc6-57507f120358','api','0'),('4a5ea0bc-fed8-4cf4-a4f0-94b4a01d67ae','Aceclofenac','1'),('c1f2f29d-878d-4541-8730-a68836ea5952','Acebutolol','1'),('ed8e5277-b687-4218-af12-c3cb3fa415df','abacavir','1'),('fa0296b4-34e9-4493-84fe-46d27edfbd4f','Abiraterone Acetate','1');
/*!40000 ALTER TABLE `api` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `api_id` varchar(45) DEFAULT NULL,
  `cas_no` varchar(45) DEFAULT NULL,
  `molecular_formula` varchar(45) DEFAULT NULL,
  `molecular_weight` varchar(45) DEFAULT NULL,
  `sz_cat_no` varchar(45) DEFAULT NULL,
  `inv_status` varchar(45) DEFAULT NULL,
  `synonyms` varchar(100) DEFAULT NULL,
  `is_active` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('3cd28ba5-e089-4b07-9273-09965aa29c05','Product1','qwes-dd-eddd-err','384380-52-3','C14H16N6O2','300.32','SZ-A049014','Under Development','(1S,4R)-4-(2-amino-6-(cyclopropylamino)-9H-purin-9-yl)cyclopent-2-ene-1-carboxylic acid','0'),('40e27d37-f80b-47c5-8848-0fa89a9c945b','Abacavir-usp-rc-c','ed8e5277-b687-4218-af12-c3cb3fa415df','172015-79-1','C11H13Cl2N5O','302.16','SZ-A049009','In Stock','((1S,4R)-4-(2-amino-6-chloro-9H-purin-9-yl)cyclopent-2-en-1-yl)methanol hydrochloride','1'),('5d5d74b7-4a38-4ad9-98b2-3cc15414777d','Product1','qwes-dd-eddd-err','384380-52-3','C14H16N6O2','300.32','SZ-A049014','Under Development','(1S,4R)-4-(2-amino-6-(cyclopropylamino)-9H-purin-9-yl)cyclopent-2-ene-1-carboxylic acid','0'),('895d8fb9-a5b2-4a86-90d3-ca9715ba7530','Abacavir EP Impurity D','ed8e5277-b687-4218-af12-c3cb3fa415df','267668-71-3','C14H18N6O 2HCl','286.34 ; 72.92','SZ-A049005','Under Development',' ((1R,4R)-4-(2-amino-6-(cyclopropylamino)-9H-purin-9-yl)cyclopent-2-en-1-yl)methanol','1'),('dad6a680-525f-4a8a-a1cd-329ac5eaf94c','Abacavir EP Impurity A','ed8e5277-b687-4218-af12-c3cb3fa415df','136470-79-6','C14H18N6O','286.33','SZ-A049002','Under Development','((1R,4S)-4-(2-amino-6-(cyclopropylamino)-9H-purin-9-yl)cyclopent-2-en-1-yl)methanol','1');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rfq`
--

DROP TABLE IF EXISTS `rfq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rfq` (
  `id` varchar(45) NOT NULL,
  `product_id` varchar(45) DEFAULT NULL,
  `is_active` varchar(2) DEFAULT NULL,
  `full_name` varchar(75) DEFAULT NULL,
  `official_email` varchar(75) DEFAULT NULL,
  `company_name` varchar(45) DEFAULT NULL,
  `contact_no` varchar(45) DEFAULT NULL,
  `packages` int(11) DEFAULT NULL,
  `package_type` varchar(45) DEFAULT NULL,
  `rfq_date` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rfq`
--

LOCK TABLES `rfq` WRITE;
/*!40000 ALTER TABLE `rfq` DISABLE KEYS */;
INSERT INTO `rfq` VALUES ('b2414271-7427-413a-9254-57cb4f8ae66a','40e27d37-f80b-47c5-8848-0fa89a9c945b','1','Amarsang Gohil','amar8gohil','spec india','+9419898998985',8,'KG',1521795206692),('bab29f3f-7435-4685-92b8-9e7506a26901','40e27d37-f80b-47c5-8848-0fa89a9c945b','1','Vijay Gohil','viajy','spec india','+9417777998985',7,'KG',1521795245550);
/*!40000 ALTER TABLE `rfq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `is_active` varchar(2) DEFAULT NULL,
  `user_type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('40e27d37-f80b-47c5-8848-0fa89a9c945b','admin@gmail.com','Admin@123','1','admin');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'intellociplabs'
--

--
-- Dumping routines for database 'intellociplabs'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-23 14:31:56
