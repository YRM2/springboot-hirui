package com.springboot.hirui.common;

/**
 * 错误码接口
 * @author RM
 *
 */
public interface IErrorCode {

	/**
	 * 获取错误码
	 * @return
	 */
	String getCode();
	
	/**
	 * 获取错误码描述
	 * @return
	 */
	String getMessage();
}
