package com.springboot.hirui.pojo;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(value = "ProductDO", description ="商品信息POJO类")
public class ProductDO {
	
	@ApiModelProperty(value = "商品id")
	private Long id;
	
	@ApiModelProperty(value = "品牌id")
	private Long brandId;
	
	@ApiModelProperty(value = "商品类别id")
	private Long productCategoryId;
	
	@ApiModelProperty(value = "")
	private Long feightTemplateId;
	
	@ApiModelProperty(value = "商品属性类别id")
	private Long productAttributeCategoryId;
	
	@ApiModelProperty(value = "商品名称")
	private String name;
	
	@ApiModelProperty(value = "商品图片url")
	private String pic;
	
	@ApiModelProperty(value = "商品编号")
	private String productSn;
	
	@ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
	private Integer deleteStatus;
	
	@ApiModelProperty(value = "上架状态：0->下架；1->上架")
	private Integer publishStatus;
	
	@ApiModelProperty(value = "新品状态:0->不是新品；1->新品")
	private Integer newStatus;
	
	@ApiModelProperty(value = "推荐状态；0->不推荐；1->推荐")
	private Integer recommandStatus;
	
	@ApiModelProperty(value = "审核状态：0->未审核；1->审核通过")
	private Integer verifyStatus;
	
	@ApiModelProperty(value = "排序")
	private Integer sort;
	
	@ApiModelProperty(value = "销量")
	private  Integer sale;
	
	@ApiModelProperty(value = "")
	private BigDecimal price;
	
	@ApiModelProperty(value = "促销价格")
	private BigDecimal promotionPrice;
	
	@ApiModelProperty(value = "赠送的成长值")
	private Integer giftGrowth;
	
	@ApiModelProperty(value = "赠送的积分")
	private Integer giftPoint;
	
	@ApiModelProperty(value = "限制使用的积分数")
	private Integer usePointLimit;
	
	@ApiModelProperty(value = "副标题")
	private String subTitle;
	
	@ApiModelProperty(value = "商品描述")
	private String description;
	
	@ApiModelProperty(value = "市场价")
	private BigDecimal originalPrice;
	
	@ApiModelProperty(value = "库存")
	private Integer stock;
	
	@ApiModelProperty(value = "库存预警值")
	private Integer lowStock;
	
	@ApiModelProperty(value = "单位")
	private String unit;
	
	@ApiModelProperty(value = "商品重量, 克")
	private BigDecimal weight;
	
	@ApiModelProperty(value = "是否为预告商品：0->不是；1->是")
	private Integer previewStatus;
	
	@ApiModelProperty(value = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
	private String serviceIds;
	
	@ApiModelProperty(value = "关键字")
	private String keywords;
	
	@ApiModelProperty(value = "备注")
	private String note;
	
	@ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割")
	private String albumPics;
	
	@ApiModelProperty(value = "产品详情标题")
	private String detailTitle;
	
	@ApiModelProperty(value = "产品详情描述")
	private String detailDesc;
	
	@ApiModelProperty(value = "产品详情网页内容")
	private String detailHtml;
	
	@ApiModelProperty(value = "移动端网页详情")
	private String detailMobileHtml;
	
	@ApiModelProperty(value = "促销开始时间")
	private Date promotionStartTime;
	
	@ApiModelProperty(value = "促销结束时间")
	private Date promotionEndTime;
	
	@ApiModelProperty(value = "活动限购数量")
	private Integer promotionPerLimit;
	
	@ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
	private Integer promotionType;
	
	@ApiModelProperty(value = "品牌名称")
	private String brandName;
	
	@ApiModelProperty(value = "商品分类名称")
	private String productCategoryName;
	
	
}
