package com.wipro.ExceptionHandling;

public class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		super();
		System.out.println("User Outside India cannot be registered.");
	}
}
