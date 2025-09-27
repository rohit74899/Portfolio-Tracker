package org.Portfolio.exception;

public class userNotFoundException extends RuntimeException{

	public userNotFoundException() {
		super();
	}
	
	public userNotFoundException(String message) {
		super(message);
	}
}
