package com.wipro.flowcontrolstatements;

public class Ex17 {
	public static void main(String args[]) {
		int l=args[0].length();
		String s="";
		while(l!=0) {
			s=s+args[0].charAt(l-1);
			l--;
		}
		if(s.equals(args[0]))
			System.out.println(args[0]+" is a palindrome");
		else
			System.out.println(args[0]+" is not a palindrome");
	}
}
