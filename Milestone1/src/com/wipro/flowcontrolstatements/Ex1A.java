package com.wipro.flowcontrolstatements;

public class Ex1A {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		if(a==0)
			System.out.println("The given number is Zero");
		else if(a>0)
			System.out.println("The given number is Positive");
		else
			System.out.println("The given number is Negative");
	}
}
