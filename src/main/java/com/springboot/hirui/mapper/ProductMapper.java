package com.springboot.hirui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.hirui.pojo.ProductDO;

/**
 * 商品Mapper
 * @author RM
 *
 */
@Mapper
public interface ProductMapper {

	/**
	 * 插入商品数据
	 * @param product
	 * @return
	 */
	int insert(ProductDO product);
	
	/**
	 * 分页查询商品信息
	 * @return
	 */
	List<ProductDO> slectProducts();
}
