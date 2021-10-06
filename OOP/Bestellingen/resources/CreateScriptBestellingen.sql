CREATE SCHEMA `Bestellingen`;
USE `Bestellingen`;

--
-- Table structure for table `Klant`
--
CREATE TABLE `Klant` (
  `klantnr` int(11) NOT NULL AUTO_INCREMENT,
  `klantnaam` varchar(45) NOT NULL,
  `plaats` varchar(45) NOT NULL,
  PRIMARY KEY (`klantnr`)
) ;

--
-- Table structure for table `Artikel`
--
CREATE TABLE `Artikel` (
  `artikelcode` varchar(12) NOT NULL,
  `artikelnaam` varchar(45) NOT NULL,
  `btwtarief` varchar(4) NOT NULL,
  `artikelprijs` decimal(6,2) NOT NULL,
  `voorraad` int(11) NOT NULL,
  PRIMARY KEY (`artikelcode`)
) ;
--
-- Table structure for table `Bestelling`
--
CREATE TABLE `Bestelling` (
  `bestelnr` int(11) NOT NULL AUTO_INCREMENT,
  `klantnr` int(11) NOT NULL,
  `besteldatum` date NOT NULL,
  PRIMARY KEY (`bestelnr`),
  KEY `fk_Bestelling_Klant_idx` (`klantnr`),
  CONSTRAINT `fk_Bestelling_Klant` FOREIGN KEY (`klantnr`) REFERENCES `Klant` (`klantnr`)
) ;
--
-- Table structure for table `Bestelregel`
--
CREATE TABLE `Bestelregel` (
  `bestelnr` int(11) NOT NULL,
  `artikelcode` varchar(12) NOT NULL,
  `aantal` int(11) NOT NULL,
  PRIMARY KEY (`bestelnr`,`artikelcode`),
  KEY `fk_bestelregel_artikel_idx` (`artikelcode`),
  CONSTRAINT `fk_bestelregel_artikel` FOREIGN KEY (`artikelcode`) REFERENCES `Artikel` (`artikelcode`),
  CONSTRAINT `fk_bestelregel_bestelling` FOREIGN KEY (`bestelnr`) REFERENCES `Bestelling` (`bestelnr`) ON DELETE CASCADE
) ;

-- Gebruiker definiëren en toegang verlenen
CREATE USER 'userBestellingen'@'localhost' IDENTIFIED BY 'pwBestellingen';
GRANT ALL PRIVILEGES ON Bestellingen . * TO 'userBestellingen'@'localhost';


