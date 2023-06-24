/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : localhost:3306
 Source Schema         : road-map

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 24/06/2023 09:01:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for rule_tree
-- ----------------------------
DROP TABLE IF EXISTS `rule_tree`;
CREATE TABLE `rule_tree` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tree_name` varchar(64) DEFAULT NULL COMMENT '规则树Id',
  `tree_desc` varchar(128) DEFAULT NULL COMMENT '规则树描述',
  `tree_root_node_id` bigint(20) DEFAULT NULL COMMENT '规则树根ID',
  `create_time` datetime(3) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(3) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2110081903 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rule_tree
-- ----------------------------
BEGIN;
INSERT INTO `rule_tree` VALUES (2110081902, '抽奖活动规则树', '用于决策不同用户可参与的活动', 1, '2021-10-08 15:38:05.000', '2021-10-08 15:38:05.000');
COMMIT;

-- ----------------------------
-- Table structure for rule_tree_node
-- ----------------------------
DROP TABLE IF EXISTS `rule_tree_node`;
CREATE TABLE `rule_tree_node` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tree_id` int(2) DEFAULT NULL COMMENT '规则树ID',
  `node_type` int(2) DEFAULT NULL COMMENT '节点类型；1子叶、2果实',
  `node_value` varchar(32) DEFAULT NULL COMMENT '节点值[nodeType=2]；果实值',
  `rule_key` varchar(16) DEFAULT NULL COMMENT '规则Key',
  `rule_desc` varchar(32) DEFAULT NULL COMMENT '规则描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rule_tree_node
-- ----------------------------
BEGIN;
INSERT INTO `rule_tree_node` VALUES (1, 2110081902, 1, NULL, 'userGender', '用户性别[男/女]');
INSERT INTO `rule_tree_node` VALUES (11, 2110081902, 1, NULL, 'userAge', '用户年龄');
INSERT INTO `rule_tree_node` VALUES (12, 2110081902, 1, NULL, 'userAge', '用户年龄');
INSERT INTO `rule_tree_node` VALUES (111, 2110081902, 2, '100001', NULL, NULL);
INSERT INTO `rule_tree_node` VALUES (112, 2110081902, 2, '100002', NULL, NULL);
INSERT INTO `rule_tree_node` VALUES (121, 2110081902, 2, '100003', NULL, NULL);
INSERT INTO `rule_tree_node` VALUES (122, 2110081902, 2, '100004', NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for rule_tree_node_line
-- ----------------------------
DROP TABLE IF EXISTS `rule_tree_node_line`;
CREATE TABLE `rule_tree_node_line` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tree_id` bigint(20) DEFAULT NULL COMMENT '规则树ID',
  `node_id_from` bigint(20) DEFAULT NULL COMMENT '节点From',
  `node_id_to` bigint(20) DEFAULT NULL COMMENT '节点To',
  `rule_limit_type` int(2) DEFAULT NULL COMMENT '限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围];7:果实',
  `rule_limit_value` varchar(32) DEFAULT NULL COMMENT '限定值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rule_tree_node_line
-- ----------------------------
BEGIN;
INSERT INTO `rule_tree_node_line` VALUES (1, 2110081902, 1, 11, 1, 'man');
INSERT INTO `rule_tree_node_line` VALUES (2, 2110081902, 1, 12, 1, 'woman');
INSERT INTO `rule_tree_node_line` VALUES (3, 2110081902, 11, 111, 3, '25');
INSERT INTO `rule_tree_node_line` VALUES (4, 2110081902, 11, 112, 4, '25');
INSERT INTO `rule_tree_node_line` VALUES (5, 2110081902, 12, 121, 3, '25');
INSERT INTO `rule_tree_node_line` VALUES (6, 2110081902, 12, 122, 4, '25');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` varchar(9) DEFAULT NULL COMMENT '用户ID',
  `user_nickname` varchar(32) DEFAULT NULL COMMENT '用户昵称',
  `user_head` varchar(16) DEFAULT NULL COMMENT '用户头像',
  `user_password` varchar(64) DEFAULT NULL COMMENT '用户密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '184172133', '小傅哥', '01_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (2, '980765512', '铁锤', '02_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (3, '796542178', '团团', '03_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (4, '523088136', '哈尼克兔', '04_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (5, '123456001', '比丘卡', '05_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (6, '123456002', '兰兰', '06_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (7, '123456003', 'Alexa', '07_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (8, '123456004', '小白', '08_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (9, '123456005', '铃铛', '09_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (10, '123456006', '马小帅', '10_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (11, '123456007', 'S.A.K', '11_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (12, '123456008', '池鱼有点贤', '12_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
