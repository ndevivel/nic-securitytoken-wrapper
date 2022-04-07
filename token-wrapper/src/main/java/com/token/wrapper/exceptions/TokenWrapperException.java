package com.token.wrapper.exceptions;

/**
 * Exception class for TokenWrapper
 * @author lenovo
 *
 */
@SuppressWarnings("serial")
public class TokenWrapperException extends Exception{

	String message=new String();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TokenWrapperException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "TokenWrapperException [message=" + message + "]";
	}
	
}
