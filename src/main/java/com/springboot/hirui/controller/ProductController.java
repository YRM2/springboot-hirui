package com.springboot.hirui.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hirui.common.ErrorCode;
import com.springboot.hirui.common.RestPage;
import com.springboot.hirui.common.RestResult;
import com.springboot.hirui.exception.DAOException;
import com.springboot.hirui.pojo.ProductDO;
import com.springboot.hirui.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 商品信息管理类
 * @author RM
 *
 */
@Api(tags = "商品信息管理")
@RestController
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product")
	public RestResult<String> addProduct() {
		return RestResult.success("Hi Rui");
	}
	
	@PutMapping("/product")
	public RestResult<String> putProduct() {
		return RestResult.success("Hi");
	}
	
	@ApiOperation(value = "分页查询商品", notes = "分页查询商品信息")
	@ApiImplicitParams({
        @ApiImplicitParam(paramType = "query", name = "pageSize",
                value = "每页显示条数", required = true, defaultValue = "10"),
        @ApiImplicitParam(paramType = "query", name = "pageNum",
                value = "当前页码", required = true, defaultValue = "1")
	})
	@GetMapping("/product")
	public RestResult<RestPage<ProductDO>> getProduct(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, 
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		try {
			List<ProductDO> productList = productService.list(pageSize, pageNum);
			return RestResult.success(RestPage.transformPage(productList));
		} catch (DAOException e) {
			log.error(e.getMessage(), e);
		}
		return RestResult.failed(ErrorCode.FAILED);
	}
	
	@DeleteMapping("/product")
	public RestResult<String> deleteProduct() {
		return RestResult.success("bye");
	}
	
    @ApiIgnore
    @GetMapping("/test")
    public String test() {
        return "这是一个测试接口，添加@ApiIgnore注解，在swagger文档中即不显示";
    }
}
