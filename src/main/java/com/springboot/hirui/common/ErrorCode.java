package com.springboot.hirui.common;

public enum ErrorCode implements IErrorCode {
	SUCCESS("00000", "一切ok"),
	FAILED("11111", "失败"),
	
	USER_REQUEST_PARAM_ERROR("A0400", "用户请求参数错误"),
	MUST_REQUEST_PARAM_NULL("A0410", "请求必填参数为空"),
	REQUEST_PARAM_VALUE_OUTOF_RANGE("A0420", "请求参数值超出允许范围"),
	PARAM_FORMAT_MISMATCH("A0421", "参数格式不匹配");
	
	private String code;
	
	private String message;
	
	private ErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
