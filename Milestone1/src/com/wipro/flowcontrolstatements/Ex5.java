package com.wipro.flowcontrolstatements;

public class Ex5 {
	public static void main(String args[]) {
		char ch=args[0].charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Alphabhet");
		else if(ch>='0'&&ch<='9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}
