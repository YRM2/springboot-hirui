package com.springboot.hirui.service;

import java.util.List;

import com.springboot.hirui.exception.DAOException;
import com.springboot.hirui.pojo.ProductDO;

public interface ProductService {

	List<ProductDO> list(Integer pageSize, Integer pageNum) throws DAOException;
}
