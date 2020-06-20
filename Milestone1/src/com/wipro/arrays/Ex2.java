package com.wipro.arrays;

public class Ex2 {
	public static void main(String args[]) {
		int l=args.length,n;
		int min=Integer.parseInt(args[0]);
		int max=Integer.parseInt(args[0]);
		for(int i=1;i<l;i++) {
			n=Integer.parseInt(args[i]);
			if(n<min)
				min=n;
			if(n>max)
				max=n;
		}
		System.out.println("Minimum value of the array is: "+min);
		System.out.println("Maximum value of the array is: "+max);
	}
}
