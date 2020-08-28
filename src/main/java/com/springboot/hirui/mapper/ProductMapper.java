package com.springboot.hirui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.hirui.pojo.ProductDO;

@Mapper
public interface ProductMapper {

	int insert(ProductDO product);
	
	List<ProductDO> slectProducts();
}
