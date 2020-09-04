CREATE TABLE `merchandise` (
  `MerchID` int(10) NOT NULL COMMENT '商品编号',
  `MerchName` varchar(50) NOT NULL COMMENT '商品名称',
  `MerchCostPrice` decimal(6,0) NOT NULL COMMENT '商品成本单价',
  `MerchPrice` decimal(6,0) NOT NULL COMMENT '商品单价',
  `MerchNum` int(6) NOT NULL COMMENT '商品库存数量',
  `CautionNum` int(4) NOT NULL COMMENT '库存报警数量',
  `PlanNum` int(6) DEFAULT NULL COMMENT '计划进货量',
  `BarCode` varchar(50) DEFAULT NULL COMMENT '商品条形码',
  `SalesProPrice` decimal(6,0) DEFAULT NULL COMMENT '促销价格',
  `SalesProStartDate` datetime(6) DEFAULT NULL COMMENT '促销开始日期',
  `SalesProEndDate` datetime(6) DEFAULT NULL COMMENT '促销结束日期',
  `AllowAbate` int(1) NOT NULL COMMENT '允许打折',
  `AllowSale` int(1) NOT NULL COMMENT '允许销售',
  `FactoryID` varchar(10) NOT NULL COMMENT '生产商编号',
  `ProvideID` varchar(10) NOT NULL COMMENT '供应商编号',
  PRIMARY KEY (`MerchID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;