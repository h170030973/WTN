package com.wipro.flowcontrolstatements;

public class Ex7 {
	public static void main(String args[]) {
		char ch=args[0].charAt(0);
		if(ch>=97 && ch<=122)
			System.out.println((char)(ch-32));
		else
			System.out.println((char)(ch+32));
	}
}
