package com.springboot.hirui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.springboot.hirui.exception.DAOException;
import com.springboot.hirui.mapper.ProductMapper;
import com.springboot.hirui.pojo.Product;
import com.springboot.hirui.service.ProductService;

/**
 * 商品Service实现类
 * @author RM
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<Product> list(Integer pageSize, Integer pageNum) throws DAOException {
		PageHelper.startPage(pageNum, pageSize);
		try {
			return productMapper.selectAll();
		} catch (Exception e) {
			throw new DAOException("select product info failed", e);
		}
	}

	@Override
	public int insert(Product product) throws DAOException {
		try {
			return productMapper.insert(product);
		} catch (Exception e) {
			throw new DAOException("insert product failed", e);
		}
	}
	
}
