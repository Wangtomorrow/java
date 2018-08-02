/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.36 : Database - providentfundraising
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`providentfundraising` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `providentfundraising`;

/*Table structure for table `personbasicinformation` */

DROP TABLE IF EXISTS `personbasicinformation`;

CREATE TABLE `personbasicinformation` (
  `accnum` varchar(12) NOT NULL,
  `unitaccnum` varchar(12) NOT NULL,
  `opendate` date DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `peraccstate` varchar(1) DEFAULT NULL COMMENT '0－正常',
  `basenumber` double DEFAULT NULL,
  `unitprop` double DEFAULT NULL,
  `indiprop` double DEFAULT NULL,
  `lastpaydate` date DEFAULT '1899-12-01',
  `unitmonpaysum` double DEFAULT NULL,
  `permonpaysum` double DEFAULT NULL,
  `ypayamt` double DEFAULT NULL,
  `ydrawamt` double DEFAULT NULL,
  `yinterestbal` double DEFAULT NULL,
  `instcode` varchar(8) NOT NULL DEFAULT '0110',
  `op` varchar(6) NOT NULL DEFAULT '111111',
  `remark` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`accnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `personbasicinformation` */

/*Table structure for table `systemparameter` */

DROP TABLE IF EXISTS `systemparameter`;

CREATE TABLE `systemparameter` (
  `seqname` varchar(20) NOT NULL,
  `seq` int(9) NOT NULL AUTO_INCREMENT,
  `maxseq` int(9) NOT NULL DEFAULT '999999999',
  `desc` varchar(40) NOT NULL,
  `freeuse1` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`seqname`),
  UNIQUE KEY `seq` (`seq`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `systemparameter` */

insert  into `systemparameter`(`seqname`,`seq`,`maxseq`,`desc`,`freeuse1`) values ('op1',1111111,999999999,'op1',NULL);

/*Table structure for table `teller` */

DROP TABLE IF EXISTS `teller`;

CREATE TABLE `teller` (
  `id` int(10) NOT NULL,
  `op` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teller` */

insert  into `teller`(`id`,`op`,`password`) values (1,'dbq','1');

/*Table structure for table `unitbasicinformation` */

DROP TABLE IF EXISTS `unitbasicinformation`;

CREATE TABLE `unitbasicinformation` (
  `unitaccnum` varchar(12) NOT NULL,
  `unitaccname` varchar(100) NOT NULL,
  `unitaddr` varchar(60) NOT NULL,
  `orgcode` varchar(20) NOT NULL,
  `unitchar` varchar(1) NOT NULL COMMENT '1-企业\r\n2-事业\r\n3-机关\r\n4-团体\r\n5-其他\r\n',
  `unitkind` varchar(3) NOT NULL COMMENT '110-国有经济',
  `salarydate` varchar(2) DEFAULT NULL,
  `unitphone` varchar(20) NOT NULL,
  `unitlinkman` varchar(24) NOT NULL,
  `unitagentpapno` varchar(20) DEFAULT NULL,
  `accstate` varchar(1) NOT NULL COMMENT '0－正常',
  `balance` double NOT NULL,
  `basenumber` double NOT NULL,
  `unitprop` double NOT NULL,
  `perprop` double NOT NULL,
  `unitpaysum` double NOT NULL,
  `perpaysum` double NOT NULL,
  `perssum` int(11) NOT NULL,
  `lastpaydate` date NOT NULL DEFAULT '1899-12-01',
  `instcode` varchar(8) NOT NULL DEFAULT '0110',
  `op` varchar(6) NOT NULL DEFAULT '111111',
  `creatdate` date NOT NULL,
  `remark` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`unitaccnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `unitbasicinformation` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
