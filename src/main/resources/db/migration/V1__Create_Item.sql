/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : yrm

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2020-08-28 17:19:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `ad` varchar(200) DEFAULT NULL COMMENT '广告词',
  `add_source` int(4) DEFAULT NULL COMMENT '来源：1、自定义添加 2、从平台商品库选择',
  `after_service` varchar(1500) DEFAULT NULL COMMENT '售后服务',
  `attr_sale` varchar(1100) DEFAULT NULL COMMENT '商品销售属性',
  `attributes` varchar(1100) DEFAULT NULL COMMENT '商品类目属性',
  `authentication` longtext COMMENT '认证信息',
  `brand` bigint(20) DEFAULT NULL,
  `cid` bigint(20) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `delisting_time` datetime DEFAULT NULL,
  `describe_url` longtext,
  `guide_price` decimal(14,2) DEFAULT NULL,
  `inventory` int(10) DEFAULT NULL,
  `item_id` bigint(20) NOT NULL COMMENT '商品id',
  `item_name` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `item_status` int(4) DEFAULT NULL COMMENT '商品状态：1、未发布，2、待审核，3、审核驳回，4、已下架、5、在售',
  `keywords` varchar(1500) DEFAULT NULL COMMENT '关键字',
  `listting_time` datetime DEFAULT NULL COMMENT '上架时间',
  `market_price` decimal(14,2) DEFAULT NULL,
  `cost_price` decimal(14,2) DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL COMMENT '修改日期',
  `operator` int(4) DEFAULT NULL COMMENT '操作方：1、商家，2、平台',
  `origin` varchar(100) DEFAULT NULL COMMENT '商品产地',
  `packing_list` varchar(800) DEFAULT NULL COMMENT '包装清单',
  `platform_id` bigint(20) DEFAULT NULL COMMENT '平台ID',
  `plst_item_id` bigint(20) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品描述url，存在jfs中',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '商家ID',
  `shop_cid` bigint(20) DEFAULT NULL,
  `shop_freight_template_id` bigint(20) DEFAULT NULL,
  `shop_id` bigint(20) DEFAULT NULL,
  `status_change_reason` varchar(200) DEFAULT NULL,
  `timing_listing` datetime DEFAULT NULL,
  `volume` decimal(14,2) DEFAULT NULL,
  `weight` decimal(11,0) DEFAULT NULL,
  `weight_unit` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
