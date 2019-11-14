DROP SCHEMA IF EXISTS `stock_platform`;

CREATE SCHEMA `stock_platform`;

use `stock_platform`;

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `singlePrice` double,
  `number` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,

  PRIMARY KEY (`id`),
  
  FOREIGN KEY (`customer_id`) 
  REFERENCES `customer` (`id`) 

  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `customer` VALUES 
  (1,'David','Adams','david@luv2code.com'),
  (2,'John','Doe','john@luv2code.com'),
  (3,'Ajay','Rao','ajay@luv2code.com'),
  (4,'Mary','Public','mary@luv2code.com'),
  (5,'Maxwell','Dixon','max@luv2code.com');

INSERT INTO `stock` VALUES 
  (1,'APPLE','39.8','32','1'),
  (2,'GOOGLE','28.6','29','2'),
  (3,'NVIDIA','22.6','29','2'),
  (4,'AMAZON','28.6','29','1'),
  (5,'FACEBOOK','13.7','29','2');


SET FOREIGN_KEY_CHECKS = 1;
