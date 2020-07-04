package com.wipro.ExceptionHandling;

public class ValuesOutOfRangeException extends Exception{
	public ValuesOutOfRangeException() {
		super();
		System.out.println("ValuesOutOfRangeException occured");
	}
}
