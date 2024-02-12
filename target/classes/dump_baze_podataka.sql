-- MariaDB dump 10.19  Distrib 10.4.32-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: osiguranici
-- ------------------------------------------------------
-- Server version	10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `osiguranici`
--



DROP TABLE IF EXISTS `osiguranici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `osiguranici` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imeOsiguranika` varchar(255) NOT NULL,
  `prezimeOsiguranika` varchar(255) NOT NULL,
  `datumRodjenjaOsiguranika` date NOT NULL,
  `brojPasosaOsiguranika` varchar(255) NOT NULL,
  `telefonOsiguranika` varchar(255) NOT NULL,
  `imejlOsiguranika` varchar(255) NOT NULL,
  `datumPutovanjaOsiguranikaOd` date NOT NULL,
  `datumPutovanjaOsiguranikaDo` date NOT NULL,
  `nacinPutovanjaOsiguranika` varchar(255) NOT NULL,
  `razlikaUDanima` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `osiguranici`
--

LOCK TABLES `osiguranici` WRITE;
/*!40000 ALTER TABLE `osiguranici` DISABLE KEYS */;
INSERT INTO `osiguranici` VALUES (78,'Nikola','Timotijevic','2024-02-13','123456789','0666821919','ntimotijevic6318rn@raf.rs','2024-02-11','2024-02-24','Grupno','13');
/*!40000 ALTER TABLE `osiguranici` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pomocniosiguranici`
--

DROP TABLE IF EXISTS `pomocniosiguranici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pomocniosiguranici` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imePomocnogOsiguranika` varchar(255) NOT NULL,
  `prezimePomocnogOsiguranika` varchar(255) NOT NULL,
  `datumRodjenjaPomocnogOsiguranika` date NOT NULL,
  `idNosiocaOsiguranja` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pomocniosiguranici`
--

LOCK TABLES `pomocniosiguranici` WRITE;
/*!40000 ALTER TABLE `pomocniosiguranici` DISABLE KEYS */;
INSERT INTO `pomocniosiguranici` VALUES (53,'Laza ','Lazic','2024-02-13',78),(54,'Pera','Peric','2024-02-12',78);
/*!40000 ALTER TABLE `pomocniosiguranici` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-11 16:19:02
