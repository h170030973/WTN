package com.wipro.ExceptionHandling;

public class Ex5 {
	public static void main(String[] args) {
		try {
			int age=Integer.parseInt(args[0]);
			if(age>=18 && age<60)
				System.out.println("Can vote successfully.");
			else
				throw new InvalidAgeException();
		}
		catch(InvalidAgeException e) {
		}
	}
}
