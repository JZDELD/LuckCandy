/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : house_rent

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-07-09 13:13:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `account` varchar(10) NOT NULL,
  `password` varchar(16) NOT NULL,
  `role` int(11) DEFAULT '1',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '超级管理员', '1024', '123456', '2', null);
INSERT INTO `admin` VALUES ('2', '小王', '1000000001', '123456', '1', null);
INSERT INTO `admin` VALUES ('3', '小李', '1000000002', '123456', '1', null);
INSERT INTO `admin` VALUES ('4', '老宋', '1000000003', '123456', '1', null);

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `total` int(11) NOT NULL,
  `now` int(11) NOT NULL,
  `price` double(7,2) NOT NULL,
  `servicePrice` double(6,2) DEFAULT NULL,
  `userId` int(11) NOT NULL,
  `paymentTime` datetime NOT NULL,
  `billStart` date NOT NULL,
  `billEnd` date NOT NULL,
  `payEnd` date NOT NULL,
  `status` int(11) DEFAULT '0',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bill
-- ----------------------------

-- ----------------------------
-- Table structure for certification
-- ----------------------------
DROP TABLE IF EXISTS `certification`;
CREATE TABLE `certification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `idNum` varchar(18) NOT NULL,
  `idPicPo` varchar(50) DEFAULT NULL,
  `idPicNe` varchar(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of certification
-- ----------------------------
INSERT INTO `certification` VALUES ('1', '王五', '420117197012257511', null, null, null);
INSERT INTO `certification` VALUES ('2', '张三', '420117197505208592', null, null, null);
INSERT INTO `certification` VALUES ('3', '赵六', '420117198004246587', null, null, null);

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cityName` varchar(10) NOT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '北京', null);
INSERT INTO `city` VALUES ('2', '上海', null);
INSERT INTO `city` VALUES ('3', '深圳', null);
INSERT INTO `city` VALUES ('4', '杭州', null);
INSERT INTO `city` VALUES ('5', '南京', null);
INSERT INTO `city` VALUES ('6', '成都', null);
INSERT INTO `city` VALUES ('7', '武汉', null);
INSERT INTO `city` VALUES ('8', '广州', null);
INSERT INTO `city` VALUES ('9', '天津', null);

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `houseId` int(11) DEFAULT NULL,
  `roomId` int(11) DEFAULT NULL,
  `collectDate` date NOT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------

-- ----------------------------
-- Table structure for configuration
-- ----------------------------
DROP TABLE IF EXISTS `configuration`;
CREATE TABLE `configuration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bed` int(11) DEFAULT '0',
  `bathroom` int(11) DEFAULT '0',
  `airConditioning` int(11) DEFAULT '0',
  `TV` int(11) DEFAULT '0',
  `router` int(11) DEFAULT '0',
  `smartLock` int(11) DEFAULT '0',
  `rangeHood` int(11) DEFAULT '0',
  `refrigerator` int(11) DEFAULT '0',
  `microwaveOven` int(11) DEFAULT '0',
  `yuba` int(11) DEFAULT '0',
  `washingMachine` int(11) DEFAULT '0',
  `wardrobe` int(11) DEFAULT '0',
  `table` int(11) DEFAULT '0',
  `chair` int(11) DEFAULT '0',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of configuration
-- ----------------------------
INSERT INTO `configuration` VALUES ('1', '1', '2', '1', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('2', '1', '0', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('3', '4', '0', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('4', '2', '0', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('5', '1', '0', '1', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('6', '1', '0', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('7', '4', '0', '1', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('8', '1', '0', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('9', '1', '0', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('10', '1', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('11', '1', '0', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('12', '1', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', null);
INSERT INTO `configuration` VALUES ('13', '1', '0', '1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('14', '1', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('15', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('16', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('17', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('18', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('19', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('20', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('21', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('22', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('23', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('24', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('25', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `configuration` VALUES ('26', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '');

-- ----------------------------
-- Table structure for contract
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `signingMethod` int(11) NOT NULL,
  `paymentMethod` int(11) NOT NULL,
  `price` double(7,2) DEFAULT '0.00',
  `servicePrice` double(6,2) DEFAULT '0.00',
  `deposit` double(7,2) DEFAULT '0.00',
  `userId` int(11) NOT NULL,
  `houseId` int(11) DEFAULT NULL,
  `roomId` int(11) DEFAULT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `lease` int(11) NOT NULL,
  `renew` int(11) DEFAULT NULL,
  `now` int(11) NOT NULL DEFAULT '1',
  `status` int(11) DEFAULT '1',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contract
-- ----------------------------
INSERT INTO `contract` VALUES ('1', '1', '1', '0.00', '0.00', '0.00', '1', null, '1', '2020-05-14', '2020-05-14', '5', null, '1', '1', null);
INSERT INTO `contract` VALUES ('2', '2', '1', '0.00', '0.00', '0.00', '2', null, '2', '2020-05-14', '2020-05-14', '6', null, '1', '2', null);
INSERT INTO `contract` VALUES ('3', '1', '1', '0.00', '0.00', '0.00', '3', null, '3', '2020-05-15', '2020-05-15', '4', null, '1', '2', null);
INSERT INTO `contract` VALUES ('4', '1', '1', '0.00', '0.00', '0.00', '4', null, '4', '2020-05-15', '2020-05-15', '4', null, '1', '2', null);
INSERT INTO `contract` VALUES ('5', '1', '1', '0.00', '0.00', '0.00', '5', null, '5', '2020-05-15', '2020-05-15', '5', null, '1', '2', null);
INSERT INTO `contract` VALUES ('6', '2', '1', '0.00', '0.00', '0.00', '6', null, '6', '2020-05-15', '2020-05-15', '3', null, '1', '1', null);
INSERT INTO `contract` VALUES ('7', '2', '1', '0.00', '0.00', '0.00', '7', null, '7', '2020-05-15', '2020-05-15', '5', null, '1', '1', null);
INSERT INTO `contract` VALUES ('8', '2', '1', '0.00', '0.00', '0.00', '8', null, '8', '2020-05-15', '2020-05-15', '3', null, '1', '1', null);
INSERT INTO `contract` VALUES ('9', '1', '1', '0.00', '0.00', '0.00', '9', null, '9', '2020-05-15', '2020-05-15', '5', null, '1', '2', null);
INSERT INTO `contract` VALUES ('10', '1', '1', '0.00', '0.00', '0.00', '10', null, '10', '2020-05-15', '2020-05-15', '6', null, '1', '2', null);
INSERT INTO `contract` VALUES ('11', '2', '1', '0.00', '0.00', '0.00', '11', null, '11', '2020-05-15', '2020-05-15', '5', null, '1', '1', null);
INSERT INTO `contract` VALUES ('12', '2', '1', '0.00', '0.00', '0.00', '12', null, '12', '2020-05-15', '2020-05-15', '6', null, '1', '1', null);

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `houseType` varchar(10) NOT NULL,
  `landlordId` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `title` varchar(50) DEFAULT NULL,
  `introduction` varchar(150) DEFAULT NULL,
  `elevator` int(11) NOT NULL,
  `time` int(11) NOT NULL,
  `degreeOfGreening` int(11) NOT NULL,
  `area` decimal(4,1) DEFAULT NULL,
  `monthlyPrice` double(7,2) DEFAULT NULL,
  `seasonPrice` double(7,2) DEFAULT NULL,
  `halfYearPrice` double(7,2) DEFAULT NULL,
  `servicePrice` double(6,2) DEFAULT NULL,
  `deposit` double(7,2) DEFAULT NULL,
  `cityId` int(11) NOT NULL,
  `regionId` int(11) NOT NULL,
  `salesmanId` int(11) NOT NULL,
  `address` varchar(100) NOT NULL,
  `configurationId` int(11) DEFAULT NULL,
  `subwayId` int(11) DEFAULT NULL,
  `communityName` varchar(100) DEFAULT NULL,
  `businessCircleName` varchar(100) DEFAULT NULL,
  `totalFloor` int(11) DEFAULT NULL,
  `nowFloor` int(11) DEFAULT NULL,
  `collectNum` int(11) DEFAULT '0',
  `image` varchar(150) DEFAULT NULL,
  `video` varchar(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '三室一厅', '1', '0', '', '', '1', '2003', '35', null, '0.00', null, null, null, null, '1', '1', '1', '家乐街开心小区B栋503号', '1', '1', '', '', '14', '5', '0', '/file/house/1/fm.jpg', '/file/house/1/video.mp4', '');
INSERT INTO `house` VALUES ('2', '三室一厅', '2', '0', null, null, '1', '2003', '35', null, null, null, null, null, null, '1', '1', '1', '家乐街开心小区B栋806号', '2', '1', null, null, '14', '8', '0', null, null, null);
INSERT INTO `house` VALUES ('3', '三室一厅', '3', '0', null, null, '1', '2003', '35', null, null, null, null, null, null, '1', '1', '1', '家乐街开心小区B栋303号', '3', '1', null, null, '14', '3', '0', null, null, null);
INSERT INTO `house` VALUES ('4', '两室一厅', '4', '0', null, null, '1', '2003', '35', null, null, null, null, null, null, '1', '1', '1', '家乐街开心小区B栋618号', '4', '1', null, null, '14', '6', '0', null, null, null);
INSERT INTO `house` VALUES ('5', '三室一厅', '5', '0', null, null, '1', '2003', '30', null, null, null, null, null, null, '1', '1', '1', '家乐街开心小区B栋714号', '5', '1', null, null, '14', '7', '0', null, null, null);
INSERT INTO `house` VALUES ('6', '三室一厅', '6', '1', null, null, '1', '2004', '26', null, null, null, null, null, null, '1', '1', '1', '家乐街茜茜小区B栋1114号', '6', '1', null, null, '15', '11', '0', null, null, null);
INSERT INTO `house` VALUES ('7', '三室一厅', '7', '1', null, null, '1', '2004', '20', null, null, null, null, null, null, '1', '1', '1', '家乐街茜茜小区B栋714号', '7', '1', null, null, '15', '6', '0', null, null, null);
INSERT INTO `house` VALUES ('8', '三室一厅', '8', '1', null, null, '1', '2004', '20', null, null, null, null, null, null, '1', '1', '1', '家乐街茜茜小区B栋414号', '8', '1', null, null, '15', '4', '0', null, null, null);
INSERT INTO `house` VALUES ('9', '三室一厅', '9', '1', null, null, '1', '2004', '20', null, null, null, null, null, null, '1', '1', '1', '家乐街茜茜小区B栋514号', '9', '1', null, null, '15', '5', '0', null, null, null);
INSERT INTO `house` VALUES ('10', '三室一厅', '10', '1', null, null, '1', '2005', '20', null, null, null, null, null, null, '1', '1', '1', '家乐街旭旭小区B栋714号', '10', '1', null, null, '16', '7', '0', null, null, null);
INSERT INTO `house` VALUES ('11', '三室一厅', '11', '1', null, null, '1', '2005', '20', null, null, null, null, null, null, '1', '1', '1', '家乐街旭旭小区B栋814号', '11', '1', null, null, '16', '8', '0', null, null, null);
INSERT INTO `house` VALUES ('12', '三室一厅', '12', '1', null, null, '1', '2005', '20', null, null, null, null, null, null, '1', '1', '1', '家乐街旭旭小区B栋914号', '12', '1', null, null, '16', '9', '0', null, null, null);

-- ----------------------------
-- Table structure for landlord
-- ----------------------------
DROP TABLE IF EXISTS `landlord`;
CREATE TABLE `landlord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `tel` varchar(11) NOT NULL,
  `password` varchar(16) NOT NULL,
  `regTime` datetime NOT NULL,
  `bankCard` varchar(19) NOT NULL,
  `role` int(11) DEFAULT '1',
  `certificationId` int(11) DEFAULT '0',
  `sex` int(11) DEFAULT '0',
  `avatar` varchar(50) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `home` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of landlord
-- ----------------------------
INSERT INTO `landlord` VALUES ('1', '王五', '17657426546', 'qqqq', '2020-04-15 15:22:17', '', '1', '1', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('2', '张三', '15676876765', 'qqqq', '2020-04-21 15:22:21', '1111111111111111112', '1', '2', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('3', '赵六', '17564654145', 'qqqq', '2020-04-21 15:22:24', '1111111111111111113', '1', '3', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('4', '王菲', '17556321321', '123456', '2020-04-21 15:23:11', '51', '1', '0', '0', null, '2020-04-10', '', '', '');
INSERT INTO `landlord` VALUES ('5', '张飞', '17565464654', '123456', '2020-04-21 15:24:00', '52', '1', '0', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('6', '黄飞鸿', '17546465465', '123456', '2020-04-21 15:24:29', '53', '1', '0', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('7', '格雷', '17565465465', '123456', '2020-04-21 15:25:14', '54', '1', '0', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('8', '香克斯', '17898654654', '12346', '2020-04-21 15:25:53', '55', '1', '0', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('9', '哈姆雷特', '17567987987', '123456', '2020-04-21 15:26:11', '56', '1', '0', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('10', '吉格斯', '18653213256', '123456', '2020-04-21 15:26:27', '57', '1', '0', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('11', '阿迪斯', '18675878996', '123456', '2020-04-27 19:02:38', '58', '1', '0', '0', null, null, null, null, null);
INSERT INTO `landlord` VALUES ('12', '毒王是', '15698755644', '123456', '2020-04-27 19:02:58', '59', '1', '0', '0', null, null, null, null, null);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `adminId` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `userContent` varchar(50) DEFAULT NULL,
  `adminContent` varchar(50) DEFAULT NULL,
  `userNew` int(11) DEFAULT NULL,
  `adminNew` int(11) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for region
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `regionName` varchar(20) NOT NULL,
  `cityId` int(11) NOT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of region
-- ----------------------------
INSERT INTO `region` VALUES ('1', '东城', '1', null);
INSERT INTO `region` VALUES ('2', '西城', '1', null);
INSERT INTO `region` VALUES ('3', '朝阳', '1', null);
INSERT INTO `region` VALUES ('4', '海淀', '1', null);
INSERT INTO `region` VALUES ('5', '丰台', '1', null);
INSERT INTO `region` VALUES ('6', '石景山', '1', null);
INSERT INTO `region` VALUES ('7', '通州', '1', null);
INSERT INTO `region` VALUES ('8', '昌平', '1', null);
INSERT INTO `region` VALUES ('9', '大兴', '1', null);
INSERT INTO `region` VALUES ('10', '顺义', '1', null);
INSERT INTO `region` VALUES ('11', '房山', '1', null);
INSERT INTO `region` VALUES ('12', '门头沟', '1', null);
INSERT INTO `region` VALUES ('13', '亦庄开发区', '1', null);
INSERT INTO `region` VALUES ('14', '徐汇', '2', null);
INSERT INTO `region` VALUES ('15', '闵行', '2', null);
INSERT INTO `region` VALUES ('16', '浦东', '2', null);
INSERT INTO `region` VALUES ('17', '嘉定', '2', null);
INSERT INTO `region` VALUES ('18', '松江', '2', null);
INSERT INTO `region` VALUES ('19', '普陀', '2', null);
INSERT INTO `region` VALUES ('20', '杨浦', '2', null);
INSERT INTO `region` VALUES ('21', '虹口', '2', null);
INSERT INTO `region` VALUES ('22', '长宇', '2', null);
INSERT INTO `region` VALUES ('23', '宝山', '2', null);
INSERT INTO `region` VALUES ('24', '静安', '2', null);
INSERT INTO `region` VALUES ('25', '黄埔', '2', null);
INSERT INTO `region` VALUES ('26', '青浦', '2', null);
INSERT INTO `region` VALUES ('27', '新静安', '2', null);
INSERT INTO `region` VALUES ('28', '福田区', '3', null);
INSERT INTO `region` VALUES ('29', '龙华区', '3', null);
INSERT INTO `region` VALUES ('30', '南山区', '3', null);
INSERT INTO `region` VALUES ('31', '宝安区', '3', null);
INSERT INTO `region` VALUES ('32', '罗湖区', '3', null);
INSERT INTO `region` VALUES ('33', '下沙', '4', null);
INSERT INTO `region` VALUES ('34', '拱墅', '4', null);
INSERT INTO `region` VALUES ('35', '江干', '4', null);
INSERT INTO `region` VALUES ('36', '萧山', '4', null);
INSERT INTO `region` VALUES ('37', '上城', '4', null);
INSERT INTO `region` VALUES ('38', '下城', '4', null);
INSERT INTO `region` VALUES ('39', '余杭', '4', null);
INSERT INTO `region` VALUES ('40', '西湖', '4', null);
INSERT INTO `region` VALUES ('41', '钱塘新区', '4', null);
INSERT INTO `region` VALUES ('42', '江宁', '5', null);
INSERT INTO `region` VALUES ('43', '雨花台', '5', null);
INSERT INTO `region` VALUES ('44', '建邺', '5', null);
INSERT INTO `region` VALUES ('45', '栖霞', '5', null);
INSERT INTO `region` VALUES ('46', '浦口', '5', null);
INSERT INTO `region` VALUES ('47', '玄武', '5', null);
INSERT INTO `region` VALUES ('48', '秦淮', '5', null);

-- ----------------------------
-- Table structure for reservation
-- ----------------------------
DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `houseId` int(11) DEFAULT NULL,
  `roomId` int(11) DEFAULT NULL,
  `time` datetime NOT NULL,
  `status` int(11) DEFAULT '0',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reservation
-- ----------------------------

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `houseId` int(11) NOT NULL,
  `configurationId` int(11) DEFAULT NULL,
  `title` varchar(50) NOT NULL,
  `introduction` varchar(150) DEFAULT NULL,
  `area` decimal(3,1) NOT NULL,
  `monthlyPrice` double(7,2) DEFAULT NULL,
  `seasonPrice` double(7,2) DEFAULT NULL,
  `halfYearPrice` double(7,2) DEFAULT NULL,
  `servicePrice` double(6,2) DEFAULT NULL,
  `deposit` double(7,2) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `collectNum` int(11) DEFAULT '0',
  `image` varchar(150) DEFAULT NULL,
  `video` varchar(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '1', '13', '开心小区3居室-01卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '12.8', '1020.00', '1000.00', '950.00', '150.00', '1500.00', '1', '0', '/file/house/1/room/1/fm.jpg', '/file/house/1/room/1/video.mp4', '');
INSERT INTO `room` VALUES ('2', '1', '14', '开心小区3居室-02卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '10.8', '950.00', '930.00', '900.00', '150.00', '1500.00', '1', '0', '/file/house/1/room/2/fm.jpg', '/file/house/1/room/2/video.mp4', '');
INSERT INTO `room` VALUES ('3', '1', '16', '开心小区3居室-02卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '8.9', '900.00', '880.00', '860.00', '150.00', '1200.00', '1', '0', '/file/house/1/room/3/fm.jpg', '/file/house/1/room/3/video.mp4', '');
INSERT INTO `room` VALUES ('4', '2', '17', '开心小区3居室-01卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '12.5', '1000.00', '999.00', '950.00', '150.00', '1300.00', '1', '0', '/file/house/2/room/4/fm.jpg', '/file/house/2/room/4/video.mp4', '');
INSERT INTO `room` VALUES ('5', '2', '18', '开心小区3居室-02卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '9.8', '900.00', '888.00', '850.00', '150.00', '1300.00', '1', '0', '/file/house/2/room/5/fm.jpg', '/file/house/2/room/5/video.mp4', '');
INSERT INTO `room` VALUES ('6', '2', '19', '开心小区3居室-03卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '8.8', '800.00', '777.00', '750.00', '150.00', '1300.00', '1', '0', '/file/house/2/room/6/fm.jpg', '/file/house/2/room/6/video.mp4', '');
INSERT INTO `room` VALUES ('7', '3', '20', '开心小区3居室-01卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '12.0', '1000.00', '989.00', '950.00', '150.00', '1300.00', '1', '0', '/file/house/3/room/7/fm.jpg', '/file/house/3/room/7/video.mp4', '');
INSERT INTO `room` VALUES ('8', '3', '21', '开心小区3居室-02卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '10.0', '900.00', '898.00', '849.00', '150.00', '1300.00', '1', '0', '/file/house/3/room/8/fm.jpg', '/file/house/3/room/8/video.mp4', '');
INSERT INTO `room` VALUES ('9', '3', '22', '开心小区3居室-03卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '8.0', '800.00', '787.00', '759.00', '150.00', '1300.00', '1', '0', '/file/house/3/room/9/fm.jpg', '/file/house/3/room/9/video.mp4', '');
INSERT INTO `room` VALUES ('10', '4', '23', '开心小区3居室-01卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '15.0', '1200.00', '1188.00', '1150.00', '150.00', '1300.00', '1', '0', '/file/house/4/room/10/fm.jpg', '/file/house/4/room/10/video.mp4', '');
INSERT INTO `room` VALUES ('11', '4', '24', '开心小区3居室-02卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '10.0', '1000.00', '998.00', '950.00', '150.00', '1300.00', '1', '0', '/file/house/4/room/11/fm.jpg', '/file/house/4/room/11/video.mp4', '');
INSERT INTO `room` VALUES ('12', '5', '15', '开心小区3居室-01卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '16.0', '1500.00', '1497.00', '1450.00', '150.00', '1300.00', '1', '0', '/file/house/5/room/12/fm.jpg', '/file/house/5/room/12/video.mp4', '');
INSERT INTO `room` VALUES ('13', '5', '25', '开心小区3居室-02卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '14.0', '1300.00', '1260.00', '1340.00', '150.00', '1300.00', '1', '0', '/file/house/5/room/13/fm.jpg', '/file/house/5/room/13/video.mp4', '');
INSERT INTO `room` VALUES ('14', '5', '26', '开心小区3居室-03卧', '该卧室为优化间，但是确实很温馨哦。让自如给您一个有爱的家吧，入住自如就有惊喜哦，快快入住哦，让自如给您一个家。', '13.3', '1200.00', '1140.00', '1100.00', '150.00', '1300.00', '1', '0', '/file/house/5/room/14/fm.jpg', '/file/house/5/room/14/video.mp4', '');

-- ----------------------------
-- Table structure for salesman
-- ----------------------------
DROP TABLE IF EXISTS `salesman`;
CREATE TABLE `salesman` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) NOT NULL,
  `tel` varchar(6) NOT NULL,
  `avatar` varchar(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salesman
-- ----------------------------
INSERT INTO `salesman` VALUES ('1', '达西', '123456', null, null);
INSERT INTO `salesman` VALUES ('2', '路西', '123457', null, null);
INSERT INTO `salesman` VALUES ('3', '萨博', '123458', null, null);

-- ----------------------------
-- Table structure for subway
-- ----------------------------
DROP TABLE IF EXISTS `subway`;
CREATE TABLE `subway` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subwayLine` varchar(20) NOT NULL,
  `cityId` int(11) NOT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subway
-- ----------------------------
INSERT INTO `subway` VALUES ('1', '1号线', '1', null);
INSERT INTO `subway` VALUES ('2', '2号线', '1', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(8) NOT NULL,
  `tel` varchar(11) NOT NULL,
  `password` varchar(16) NOT NULL,
  `regTime` datetime NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `role` int(11) DEFAULT '1',
  `certificationId` int(11) DEFAULT '0',
  `sex` int(11) DEFAULT '0',
  `avatar` varchar(50) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `home` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `signature` varchar(150) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tel` (`tel`,`email`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '那一年', '17671436465', '123456', '2020-01-28 17:37:11', '1048001@qq.com', '1', '0', '1', '/file/user/1/avatarPic.png', '2000-10-31', '湖北', '武汉', 'xxxxxx555', '');
INSERT INTO `user` VALUES ('2', '那二年', '17671435555', '123456', '2020-01-28 17:37:48', '1048002@qq.com', '1', '0', '0', '/file/user/2/avatarPic.png', '2019-01-09', '湖南', '长沙', '我爱湖南', '');
INSERT INTO `user` VALUES ('3', '那三年', '17687986546', '123456', '2020-01-28 17:38:24', '1048003@qq.com', '1', '0', '0', '/file/user/3/avatarPic.png', null, '', '', '', '');
INSERT INTO `user` VALUES ('4', '那四年', '13076540056', '123456', '2020-01-28 17:38:40', '1048004@qq.com', '1', '0', '0', '/file/user/4/avatarPic.png', null, '', '', '', '');
INSERT INTO `user` VALUES ('5', '那五年', '17778651325', '123456', '2020-01-28 17:39:39', '1048005@qq.com', '1', '0', '0', '', null, null, null, null, null);
INSERT INTO `user` VALUES ('6', '啊啊啊', '17689542596', '123456', '2020-01-28 17:40:24', '1048006@qq.com', '1', '0', '0', '/file/user/6/avatarPic.png', null, '', '', '', '');
INSERT INTO `user` VALUES ('7', '不不不', '17896653321', '123456', '2020-01-28 17:41:11', '1048007@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('8', '错错错', '17687998765', '123456', '2020-01-28 17:41:39', '1048008@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('9', '钱钱钱', '17632132002', '123456', '2020-01-28 17:42:16', '1048009@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('10', '小黄啊', '17686565465', '123456', '2020-01-28 20:24:43', '1048010@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('11', '晓南', '17665498798', '123456', '2020-01-28 20:25:04', '1048011@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('12', '奥兹', '18675465897', '123456', '2020-01-28 20:25:20', '1048012@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('13', '虚啊', '18075646546', '123456', '2020-01-28 20:25:37', '1048013@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('14', '按时啊', '17675465465', '123456', '2020-01-28 20:25:56', '1048014@qq.com', '1', '0', '0', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('15', '我啊啊', '17671445005', '123456', '2020-04-16 18:18:23', '', '1', '0', '0', null, null, '', '', '嘻嘻嘻嘻嘻', '');
