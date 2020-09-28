package com.springboot.hirui.service;

import java.util.List;

import com.springboot.hirui.exception.DAOException;
import com.springboot.hirui.pojo.Product;

/**
 * 商品Service接口
 * @author RM
 *
 */
public interface ProductService {

	/**
	 * 分页查询商品信息
	 * @param pageSize
	 * @param pageNum
	 * @return
	 * @throws DAOException
	 */
	List<Product> list(Integer pageSize, Integer pageNum) throws DAOException;
	
	/**
	 * 添加商品
	 * @param product
	 * @return
	 * @throws DAOException
	 */
	int insert(Product product) throws DAOException;
}
