/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.28-log : Database - daliy
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`daliy` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_croatian_ci */;

USE `daliy`;

/*Table structure for table `report` */

DROP TABLE IF EXISTS `report`;

CREATE TABLE `report` (
  `reportid` int(255) NOT NULL AUTO_INCREMENT,
  `reporttype` int(1) NOT NULL,
  `workcontent` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `difficulty` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `solution` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `experience` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `plan` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `createddate` datetime NOT NULL,
  `createdperson` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `createdgroup` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `createdid` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  PRIMARY KEY (`reportid`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `report` */

insert  into `report`(`reportid`,`reporttype`,`workcontent`,`difficulty`,`solution`,`experience`,`plan`,`createddate`,`createdperson`,`createdgroup`,`createdid`) values (1,1,'无','无','无','无','无','2020-01-20 00:00:00','张三','1','1'),(2,2,'我','我','1','为','1','2020-01-17 13:24:25','张三','1','1'),(3,1,'w','w','w','w','w','2020-01-21 12:11:04','li','1','1'),(4,1,'asd','asd','sssss','sdadads','asdasd','2020-01-21 13:43:56','张三','1','1'),(5,1,'asd','asd','sssss','sdadads','asdasd','2020-01-21 13:44:09','张三','1','1'),(6,1,'萨','asd','说','2','asdasd','2020-01-21 13:45:32','张三','1','1'),(7,1,'asd','ssss','sssss','sdadads','sss','2020-01-21 13:47:10','li','1','2'),(8,1,'sadasd','sadaaaaaaaaaa','asdad','asdasd','sadasdsadad','2020-01-21 13:52:10','张三','1','1'),(9,1,'asd','d','sadsa','sadsa','sadasd','2020-01-22 09:23:28','张三','1','1'),(10,1,'asd','asd','sadad','ssss','asdasd','2020-01-22 18:32:20','张三','1','1'),(11,1,'asd','asd','sssss','sdadads','asdasd','2020-02-07 12:27:25','张三','1','1'),(13,1,'撒打算','12厄齐尔玩','我去饿饿','委屈饿','我去饿','2020-02-07 17:44:23','张三','1','1'),(14,1,'asd','sada','sad','sad','asd','2020-02-12 16:34:55','li','1','2'),(15,1,'完成日报系统','无','无','纸上得来终觉浅','巩固完善','2020-02-12 16:42:23','li','1','2'),(16,1,'the request was rejected because no multipart boundary was foundthe request was rejected because no multipart boundary was found','the request was rejected because no multipart boundary was found','the request was rejected because no multipart boundary was found','the request was rejected because no multipart boundary was found','the request was rejected because no multipart boundary was found','2020-02-12 16:45:39','li','1','2'),(17,1,'今天好无聊','你可以告诉我嘛','给我一瓶酒，再给我一支烟。说走就走我有的是时间','可可爱爱，没有脑袋','3 2 1走','2020-02-12 20:04:10','li','1','2'),(18,1,'大苏打a','a大撒大撒','萨蒂','撒旦','阿三的','2020-02-13 16:42:53','li','1','2'),(20,1,'sad','asd','asdsa','sad','asdas','2020-02-14 12:26:22','li','1','2'),(21,1,'大撒d','d萨蒂','啊打算','圣埃蒂安','撒旦sasa','2020-02-14 13:26:20','王五','0','3'),(22,1,'撒旦','圣埃蒂安','四大','萨蒂','萨蒂','2020-02-14 13:29:04','王五','0','3'),(23,1,'1111','2222222','2333333333','44444444444','555555555555','2020-02-21 13:16:22','赵六','2','4');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) COLLATE utf8_croatian_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `enable` tinyint(1) NOT NULL DEFAULT '1',
  `groupname` varchar(64) COLLATE utf8_croatian_ci NOT NULL,
  `classname` varchar(64) COLLATE utf8_croatian_ci NOT NULL,
  `email` varchar(64) COLLATE utf8_croatian_ci DEFAULT NULL,
  `phonenumber` varchar(64) COLLATE utf8_croatian_ci DEFAULT NULL,
  `typeid` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `user` */

insert  into `user`(`userid`,`username`,`password`,`enable`,`groupname`,`classname`,`email`,`phonenumber`,`typeid`) values (1,'张三','123456',1,'1','1','1570505749@qq.com','17680946085',1),(2,'li','123456',1,'1','1','2360317531@qq.com','1570505749',2),(3,'王五','123456',1,'0','1',NULL,NULL,3),(4,'赵六','123456',1,'2','1',NULL,NULL,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
