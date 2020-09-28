package com.springboot.hirui.mapper;

import com.springboot.hirui.pojo.ProductCategory;
import java.util.List;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductCategory record);

    ProductCategory selectByPrimaryKey(Long id);

    List<ProductCategory> selectAll();

    int updateByPrimaryKey(ProductCategory record);
}