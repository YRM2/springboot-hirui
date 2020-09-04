package com.springboot.hirui.exception;

/**
 * Service层自定义异常
 * @author RM
 *
 */
@SuppressWarnings("serial")
public class ServiceException extends Exception{

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	
}
