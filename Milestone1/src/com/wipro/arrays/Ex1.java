package com.wipro.arrays;

public class Ex1 {
	public static void main(String args[]) {
		int l=args.length,sum=0;
		for(int i=0;i<l;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("Sum of the array is: "+sum);
		float a=(sum/l);
		System.out.println("Average of the array is: "+a);
	}
}
