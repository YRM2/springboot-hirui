package com.springboot.hirui.service;

import java.util.List;

import com.springboot.hirui.exception.DAOException;
import com.springboot.hirui.pojo.ProductDO;

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
	List<ProductDO> list(Integer pageSize, Integer pageNum) throws DAOException;
}
