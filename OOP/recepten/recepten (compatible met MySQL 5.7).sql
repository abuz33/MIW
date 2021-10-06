CREATE DATABASE  IF NOT EXISTS `recepten`;
USE `recepten`;

--
-- Table structure for table `ingredient`
--

DROP TABLE IF EXISTS `ingredient`;
CREATE TABLE `ingredient` (
  `idIngredient` int NOT NULL AUTO_INCREMENT,
  `hoeveelheidingram` int DEFAULT NULL,
  `aantalstukjes` int DEFAULT NULL,
  `volumeincm3` int DEFAULT NULL,
  `soort` varchar(45) NOT NULL,
  `WinkelProduct_idWinkelProduct` int NOT NULL,
  PRIMARY KEY (`idIngredient`),
  KEY `fk_Ingredient_WinkelProduct_idx` (`WinkelProduct_idWinkelProduct`),
  CONSTRAINT `fk_Ingredient_WinkelProduct` FOREIGN KEY (`WinkelProduct_idWinkelProduct`) REFERENCES `winkelproduct` (`idWinkelProduct`)
) ENGINE=InnoDB AUTO_INCREMENT=9;

--
-- Dumping data for table `ingredient`
--

LOCK TABLES `ingredient` WRITE;
/*!40000 ALTER TABLE `ingredient` DISABLE KEYS */;
INSERT INTO `ingredient` VALUES (3,400,8,0,'vlees',1),(4,250,5,0,'vlees',2),(5,0,0,300,'vloeistof',7),(6,240,0,0,'groente',4),(7,400,0,0,'groente',5);
/*!40000 ALTER TABLE `ingredient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recept`
--

DROP TABLE IF EXISTS `recept`;
CREATE TABLE `recept` (
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB;

--
-- Dumping data for table `recept`
--

LOCK TABLES `recept` WRITE;
/*!40000 ALTER TABLE `recept` DISABLE KEYS */;
INSERT INTO `recept` VALUES ('alleengroente'),('standaardlunch'),('vleesdiner');
/*!40000 ALTER TABLE `recept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recept_has_ingredient`
--

DROP TABLE IF EXISTS `recept_has_ingredient`;
CREATE TABLE `recept_has_ingredient` (
  `Recept_name` varchar(20) NOT NULL,
  `Ingredient_idIngredient` int NOT NULL,
  PRIMARY KEY (`Recept_name`,`Ingredient_idIngredient`),
  KEY `fk_Recept_has_Ingredient_Ingredient1_idx` (`Ingredient_idIngredient`),
  KEY `fk_Recept_has_Ingredient_Recept1_idx` (`Recept_name`),
  CONSTRAINT `fk_Recept_has_Ingredient_Ingredient1` FOREIGN KEY (`Ingredient_idIngredient`) REFERENCES `ingredient` (`idIngredient`),
  CONSTRAINT `fk_Recept_has_Ingredient_Recept1` FOREIGN KEY (`Recept_name`) REFERENCES `recept` (`name`)
) ENGINE=InnoDB;

--
-- Dumping data for table `recept_has_ingredient`
--

LOCK TABLES `recept_has_ingredient` WRITE;
/*!40000 ALTER TABLE `recept_has_ingredient` DISABLE KEYS */;
INSERT INTO `recept_has_ingredient` VALUES ('vleesdiner',3),('vleesdiner',4),('alleengroente',6);
/*!40000 ALTER TABLE `recept_has_ingredient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `winkelproduct`
--

DROP TABLE IF EXISTS `winkelproduct`;
CREATE TABLE `winkelproduct` (
  `idWinkelProduct` int NOT NULL AUTO_INCREMENT,
  `naam` varchar(45) DEFAULT NULL,
  `calorieenpergram` int DEFAULT NULL,
  `verkoophoeveelheidingram` int DEFAULT NULL,
  PRIMARY KEY (`idWinkelProduct`),
  UNIQUE KEY `naam_UNIQUE` (`naam`)
) ENGINE=InnoDB AUTO_INCREMENT=8;

--
-- Dumping data for table `winkelproduct`
--

LOCK TABLES `winkelproduct` WRITE;
/*!40000 ALTER TABLE `winkelproduct` DISABLE KEYS */;
INSERT INTO `winkelproduct` VALUES (1,'bief',35,200),(2,'kip',25,100),(3,'zalm',50,75),(4,'tomaat',5,30),(5,'sla',0,50),(6,'bloemkool',35,120),(7,'wijn',70,180);
/*!40000 ALTER TABLE `winkelproduct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `winkelproductenperrecept`
--

DROP TABLE IF EXISTS `winkelproductenperrecept`;
CREATE TABLE `winkelproductenperrecept` (
  `Recept_name` varchar(20) NOT NULL,
  `WinkelProduct_name` varchar(45) NOT NULL,
  PRIMARY KEY (`WinkelProduct_name`),
  KEY `fk_Recept_has_WinkelProduct_Recept1_idx` (`Recept_name`),
  CONSTRAINT `fk_Recept_has_WinkelProduct_Recept1` FOREIGN KEY (`Recept_name`) REFERENCES `recept` (`name`),
  CONSTRAINT `fk_Recept_has_WinkelProduct_WinkelProduct1` FOREIGN KEY (`WinkelProduct_name`) REFERENCES `winkelproduct` (`naam`)
) ENGINE=InnoDB;

--
-- Dumping data for table `winkelproductenperrecept`
--

LOCK TABLES `winkelproductenperrecept` WRITE;
/*!40000 ALTER TABLE `winkelproductenperrecept` DISABLE KEYS */;
/*!40000 ALTER TABLE `winkelproductenperrecept` ENABLE KEYS */;
UNLOCK TABLES;
