package com.wipro.ExceptionHandling;

public class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super();
		System.out.println("Voters with age <18 and >=60 cannot be voted.");
	}
}
