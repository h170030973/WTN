package com.wipro.ExceptionHandling;

public class NegativeValuesException extends Exception{
	public NegativeValuesException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
}