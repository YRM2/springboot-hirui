package com.springboot.hirui.exception;

/**
 * DAO层自定义异常
 * @author RM
 *
 */
@SuppressWarnings("serial")
public class DAOException extends Exception{

	public DAOException() {
		super();
	}

	public DAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

	
}
