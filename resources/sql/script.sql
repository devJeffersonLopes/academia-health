-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: academiahealth
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `cashbox`
--

DROP TABLE IF EXISTS `cashbox`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cashbox` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashbox`
--

LOCK TABLES `cashbox` WRITE;
/*!40000 ALTER TABLE `cashbox` DISABLE KEYS */;
/*!40000 ALTER TABLE `cashbox` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `whatsapp` varchar(20) NOT NULL,
  `birth_date` date NOT NULL,
  `position` varchar(100) NOT NULL,
  `salary` decimal(8,2) NOT NULL,
  `payment_day` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Jefferson Lopes','jefferson1234@academiahealth.com','$2a$12$VCBn3pLSw4hCiKbW2Hsx3OeF1eewiaVPo5L57IIeVvMXXa0ZuCF0y','123.456.789-12','1234567-8','(92) 4002-8922','(92) 4002-8922','2006-01-26','Atendente',1412.00,25);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollments`
--

DROP TABLE IF EXISTS `enrollments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` int(11) NOT NULL,
  `payment_plan_id` int(11) DEFAULT NULL,
  `registration_date` date DEFAULT current_timestamp(),
  `status` enum('ativo','suspenso') DEFAULT NULL,
  `plan_end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `member_id` (`member_id`),
  KEY `payment_plan_id` (`payment_plan_id`),
  CONSTRAINT `enrollments_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `members` (`id`),
  CONSTRAINT `enrollments_ibfk_2` FOREIGN KEY (`payment_plan_id`) REFERENCES `payment_plans` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollments`
--

LOCK TABLES `enrollments` WRITE;
/*!40000 ALTER TABLE `enrollments` DISABLE KEYS */;
INSERT INTO `enrollments` VALUES (1,1,3,'2023-03-12','ativo','2024-03-12'),(2,4,1,'2022-08-04','ativo','2023-08-04'),(3,5,4,'2021-11-17','ativo','2022-11-17'),(4,6,2,'2023-06-23','ativo','2024-06-23'),(5,7,1,'2024-01-08','ativo','2025-01-08'),(6,8,3,'2022-05-13','ativo','2023-05-13'),(7,9,NULL,'2023-07-25','suspenso',NULL),(8,10,2,'2023-09-14','ativo','2024-09-14'),(9,11,4,'2021-12-19','ativo','2022-12-19'),(10,12,1,'2024-04-03','ativo','2025-04-03'),(11,13,2,'2022-09-05','ativo','2023-09-05'),(12,14,NULL,'2022-03-22','suspenso',NULL),(13,15,3,'2023-10-11','ativo','2024-10-11'),(14,16,1,'2021-07-16','ativo','2022-07-16'),(15,17,2,'2023-01-30','ativo','2024-01-30'),(16,18,4,'2022-12-12','ativo','2023-12-12'),(17,19,3,'2024-02-18','ativo','2025-02-18'),(18,20,NULL,'2021-09-03','suspenso',NULL),(19,21,1,'2022-06-27','ativo','2023-06-27'),(20,22,2,'2023-05-09','ativo','2024-05-09'),(21,23,4,'2022-10-20','ativo','2023-10-20'),(22,24,3,'2023-12-15','ativo','2024-12-15'),(23,25,1,'2022-01-19','ativo','2023-01-19'),(24,26,2,'2023-08-06','ativo','2024-08-06'),(25,27,4,'2024-03-29','ativo','2025-03-29'),(26,28,1,'2021-04-14','ativo','2022-04-14'),(27,29,NULL,'2022-05-21','suspenso',NULL),(28,30,3,'2023-11-01','ativo','2024-11-01'),(29,31,1,'2022-07-30','ativo','2023-07-30'),(30,32,2,'2024-05-05','ativo','2025-05-05'),(31,33,3,'2021-06-18','ativo','2022-06-18'),(32,34,4,'2023-02-14','ativo','2024-02-14'),(33,36,1,'2022-08-26','ativo','2023-08-26'),(34,37,2,'2021-10-07','ativo','2022-10-07'),(35,38,4,'2023-03-03','ativo','2024-03-03'),(36,39,3,'2022-04-17','ativo','2023-04-17'),(37,40,2,'2021-09-22','ativo','2022-09-22'),(38,41,NULL,'2023-06-01','suspenso',NULL),(39,42,1,'2024-01-27','ativo','2025-01-27'),(40,43,4,'2023-05-19','ativo','2024-05-19'),(41,44,2,'2022-11-11','ativo','2023-11-11'),(42,45,3,'2021-03-25','ativo','2022-03-25'),(43,46,1,'2024-04-21','ativo','2025-04-21'),(44,47,4,'2022-07-13','ativo','2023-07-13'),(45,48,2,'2023-08-29','ativo','2024-08-29'),(46,49,3,'2021-05-02','ativo','2022-05-02'),(47,50,1,'2023-09-09','ativo','2024-09-09');
/*!40000 ALTER TABLE `enrollments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expenses`
--

DROP TABLE IF EXISTS `expenses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expenses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expenses`
--

LOCK TABLES `expenses` WRITE;
/*!40000 ALTER TABLE `expenses` DISABLE KEYS */;
/*!40000 ALTER TABLE `expenses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `incomes`
--

DROP TABLE IF EXISTS `incomes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `incomes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incomes`
--

LOCK TABLES `incomes` WRITE;
/*!40000 ALTER TABLE `incomes` DISABLE KEYS */;
/*!40000 ALTER TABLE `incomes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `whatsapp` varchar(20) NOT NULL,
  `birth_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (1,'Ana Beatriz Santos','ana.santos@email.com','123.456.789-00','MG-12.345.678','(31) 91234-5678','(31) 91234-5678','2000-05-12'),(4,'Diego Martins','diego.martins@email.com','456.789.123-10','MG-56.789.123','(31) 98574-1234','(31) 98574-1234','1992-06-25'),(5,'Eduarda Lima','eduarda.lima@email.com','654.321.987-00','BA-65.432.198','(71) 99876-5432','(71) 99876-5432','2001-09-14'),(6,'Felipe Souza','felipe.souza@email.com','159.753.486-20','PR-15.975.348','(41) 91234-5678','(41) 91234-5678','1990-01-01'),(7,'Gabriela Rocha','gabriela.rocha@email.com','258.369.147-11','RS-25.836.914','(51) 97845-1203','(51) 97845-1203','1999-12-30'),(8,'Henrique Dias','henrique.dias@email.com','741.852.963-33','SC-74.185.296','(48) 99785-4521','(48) 99785-4521','1988-08-09'),(9,'Isabela Ferreira','isabela.ferreira@email.com','963.852.741-02','PE-96.385.274','(81) 96547-1234','(81) 96547-1234','2003-02-20'),(10,'João Pedro Silva','joao.silva@email.com','357.159.486-20','AM-35.715.948','(92) 97845-2103','(92) 97845-2103','1997-04-10'),(11,'Karina Oliveira','karina.oliveira@email.com','741.963.258-12','ES-74.196.325','(27) 98765-4321','(27) 98765-4321','1996-10-11'),(12,'Leonardo Torres','leonardo.torres@email.com','852.147.963-22','GO-85.214.796','(62) 91234-5678','(62) 91234-5678','1994-07-07'),(13,'Mariana Alves','mariana.alves@email.com','369.258.147-10','CE-36.925.814','(85) 99876-5432','(85) 99876-5432','2002-11-21'),(14,'Nicolas Lima','nicolas.lima@email.com','123.789.456-70','MS-12.378.945','(67) 97654-3210','(67) 97654-3210','1993-06-16'),(15,'Olívia Pires','olivia.pires@email.com','456.321.789-90','PB-45.632.178','(83) 91234-5678','(83) 91234-5678','2000-03-27'),(16,'Paulo César','paulo.cesar@email.com','789.456.123-00','PI-78.945.612','(86) 98765-4321','(86) 98765-4321','1989-12-15'),(17,'Queila Andrade','queila.andrade@email.com','654.987.321-88','MT-65.498.732','(65) 96547-8521','(65) 96547-8521','1991-05-19'),(18,'Rafael Costa','rafael.costa@email.com','321.123.456-33','PA-32.112.345','(91) 98765-4321','(91) 98765-4321','1995-08-05'),(19,'Sabrina Mendes','sabrina.mendes@email.com','987.321.654-77','AL-98.732.165','(82) 91234-5678','(82) 91234-5678','2004-10-02'),(20,'Thiago Monteiro','thiago.monteiro@email.com','258.147.369-44','RR-25.814.736','(95) 99876-5432','(95) 99876-5432','1996-09-29'),(21,'Ursula Batista','ursula.batista@email.com','111.222.333-44','AC-11.122.233','(68) 91122-3344','(68) 91122-3344','1998-07-15'),(22,'Victor Almeida','victor.almeida@email.com','222.333.444-55','AP-22.233.344','(96) 92233-3445','(96) 92233-3445','1994-02-18'),(23,'Wesley Ferreira','wesley.ferreira@email.com','333.444.555-66','TO-33.344.455','(63) 93344-4556','(63) 93344-4556','1997-05-09'),(24,'Xênia Duarte','xenia.duarte@email.com','444.555.666-77','RO-44.455.566','(69) 94455-5667','(69) 94455-5667','1992-10-20'),(25,'Yago Ribeiro','yago.ribeiro@email.com','555.666.777-88','RR-55.566.677','(95) 95566-6778','(95) 95566-6778','1995-12-11'),(26,'Zuleika Torres','zuleika.torres@email.com','666.777.888-99','SE-66.677.788','(79) 96677-7889','(79) 96677-7889','1987-04-25'),(27,'Adriana Costa','adriana.costa@email.com','777.888.999-00','BA-77.788.899','(71) 97788-8990','(71) 97788-8990','1993-11-13'),(28,'Bruno Henrique','bruno.henrique@email.com','888.999.000-11','RS-88.899.900','(51) 98899-9001','(51) 98899-9001','1991-06-30'),(29,'Camila Braga','camila.braga@email.com','999.000.111-22','MT-99.900.011','(65) 99900-0112','(65) 99900-0112','1990-08-08'),(30,'Danilo Azevedo','danilo.azevedo@email.com','000.111.222-33','SP-00.011.122','(11) 90011-1223','(11) 90011-1223','1989-03-05'),(31,'Elaine Matos','elaine.matos@email.com','112.223.334-45','RJ-11.223.334','(21) 91122-3345','(21) 91122-3345','1996-01-21'),(32,'Fábio Araújo','fabio.araujo@email.com','223.334.445-56','GO-22.334.445','(62) 92233-3445','(62) 92233-3445','1988-09-12'),(33,'Giselle Moraes','giselle.moraes@email.com','334.445.556-67','MG-33.445.556','(31) 93344-4556','(31) 93344-4556','1999-07-28'),(34,'Heitor Barros','heitor.barros@email.com','445.556.667-78','DF-44.556.667','(61) 94455-5667','(61) 94455-5667','1993-05-14'),(36,'Jéssica Antunes','jessica.antunes@email.com','667.778.889-90','MA-66.778.889','(98) 96677-7889','(98) 96677-7889','2000-10-17'),(37,'Kelvin Assis','kelvin.assis@email.com','778.889.990-01','CE-77.889.990','(85) 97788-8990','(85) 97788-8990','2001-04-22'),(38,'Lorena Farias','lorena.farias@email.com','889.990.101-12','PE-88.990.101','(81) 98899-9001','(81) 98899-9001','1998-09-01'),(39,'Marcelo Teixeira','marcelo.teixeira@email.com','990.101.212-23','RN-99.101.212','(84) 99900-0112','(84) 99900-0112','1986-06-06'),(40,'Natália Vieira','natalia.vieira@email.com','101.212.323-34','ES-10.121.232','(27) 91011-1223','(27) 91011-1223','1997-12-24'),(41,'Otávio Lemos','otavio.lemos@email.com','212.323.434-45','PI-21.232.343','(86) 92122-3345','(86) 92122-3345','1990-02-19'),(42,'Patrícia Ramos','patricia.ramos@email.com','323.434.545-56','AM-32.343.454','(92) 93233-3445','(92) 93233-3445','1987-08-31'),(43,'Quirino Fonseca','quirino.fonseca@email.com','434.545.656-67','AC-43.454.565','(68) 94344-4556','(68) 94344-4556','1991-10-04'),(44,'Renata Luz','renata.luz@email.com','545.656.767-78','PA-54.565.676','(91) 95455-5667','(91) 95455-5667','1995-01-07'),(45,'Samuel Andrade','samuel.andrade@email.com','656.767.878-89','RR-65.676.787','(95) 96566-6778','(95) 96566-6778','2002-11-11'),(46,'Tatiane Nunes','tatiane.nunes@email.com','767.878.989-90','TO-76.787.898','(63) 97677-7889','(63) 97677-7889','1999-03-15'),(47,'Ubirajara Mendes','ubirajara.mendes@email.com','878.989.090-01','PR-87.898.909','(41) 98788-8990','(41) 98788-8990','1985-09-27'),(48,'Vânia Cardoso','vania.cardoso@email.com','989.090.101-12','SC-98.909.010','(48) 99899-9001','(48) 99899-9001','1992-04-03'),(49,'Washington Prado','washington.prado@email.com','090.101.212-23','AL-09.010.121','(82) 90900-0112','(82) 90900-0112','1988-06-20'),(50,'Xavier Pinto','xavier.pinto@email.com','101.212.323-34','SE-10.121.232','(79) 91011-1223','(79) 91011-1223','1996-12-29');
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_plans`
--

DROP TABLE IF EXISTS `payment_plans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_plans` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(100) NOT NULL,
  `description` mediumtext NOT NULL,
  `duration_months` int(11) NOT NULL,
  `full_price` decimal(8,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_plans`
--

LOCK TABLES `payment_plans` WRITE;
/*!40000 ALTER TABLE `payment_plans` DISABLE KEYS */;
INSERT INTO `payment_plans` VALUES (1,'Mensal','Plano com duração de 1 mês.',1,100.00),(2,'Trimestral','Plano com duração de 3 meses.',3,270.00),(3,'Semestral','Plano com duração de 6 meses.',6,500.00),(4,'Anual','Plano com duração de 12 meses.',12,900.00);
/*!40000 ALTER TABLE `payment_plans` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-07 22:27:19
