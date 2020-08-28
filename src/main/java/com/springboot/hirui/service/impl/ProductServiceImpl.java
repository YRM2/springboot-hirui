package com.springboot.hirui.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.springboot.hirui.exception.DAOException;
import com.springboot.hirui.mapper.ProductMapper;
import com.springboot.hirui.pojo.ProductDO;
import com.springboot.hirui.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<ProductDO> list(Integer pageSize, Integer pageNum) throws DAOException {
		PageHelper.startPage(pageNum, pageSize);
		try {
//			return productMapper.slectProducts();
			String a = null;
			List<ProductDO> list = new ArrayList<ProductDO>();
			a.isEmpty();
			return list;
		} catch (Exception e) {
			throw new DAOException("select product info faild", e);
		}
	}
	
}
