package com.springboot.hirui.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 通用返回对象<Br>
 * 仅用于本系统响应第三方调用，若非本系统返回结果，请不要用此对象封装
 * @author RM
 *
 * @param <T> 泛型 返回值
 */
@Getter
@Setter
@ApiModel(value = "RestResult<T>", description ="通用返回对象")
public class RestResult<T> {
	
	@ApiModelProperty(value = "错误码")
	private String code;
	
	@ApiModelProperty(value = "错误描述")
	private String message;
	
	@ApiModelProperty(value = "返回值数据对象")
	private T data;
	
	private RestResult(String code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public static <T> RestResult<T> success(T data){
		return new RestResult<>(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMessage(), data);
	}
	
	public static <T> RestResult<T> success(T data, String message){
		return new RestResult<T>(ErrorCode.SUCCESS.getCode(), message, data);
	}
	
	public static <T> RestResult<T> failed(IErrorCode code){
		return new RestResult<T>(code.getCode(), code.getMessage(), null);
	}
	
	public static <T> RestResult<T> failed(IErrorCode code, String message){
		return new RestResult<T>(code.getCode(), message, null);
	}
	
}
