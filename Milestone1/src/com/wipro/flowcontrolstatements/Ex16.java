package com.wipro.flowcontrolstatements;

public class Ex16 {
	public static void main(String args[]) {
		int l=args[0].length();
		//System.out.println(l);
		while(l!=0) {
			System.out.print(args[0].charAt(l-1));
			l--;
		}
	}
}
