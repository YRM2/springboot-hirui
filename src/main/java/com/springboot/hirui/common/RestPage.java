package com.springboot.hirui.common;

import java.util.List;

import com.github.pagehelper.PageInfo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 分页通用对象类
 * @author RM
 *
 * @param <T> 泛型  返回值
 */
@Getter
@Setter
@ApiModel(value = "RestPage<T>", description ="分页通用对象")
public class RestPage<T> {
	
	@ApiModelProperty(value = "当前页码")
	private Integer pageNum;
	
	@ApiModelProperty(value = "每页大小")
	private Integer pageSize;
	
	@ApiModelProperty(value = "总页数")
	private Integer totolPage;
	
	@ApiModelProperty(value = "总数")
	private Long total;
	
	@ApiModelProperty(value = "返回值")
	private List<T> list;
	
	public static <T> RestPage<T> transformPage(List<T> list){
		RestPage<T> result = new RestPage<>();
		PageInfo<T> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		result.setList(pageInfo.getList());
		result.setPageNum(pageInfo.getPageNum());
		result.setPageSize(pageInfo.getPageSize());
		result.setTotolPage(pageInfo.getPages());
		return result;
	}
}
