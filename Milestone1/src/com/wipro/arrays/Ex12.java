package com.wipro.arrays;

public class Ex12 {
	public static void main(String[] args) {
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		for(int i=0;i<3;i++)
			a[i]=Integer.parseInt(args[i]);
		for(int i=3;i<6;i++)
			b[i-3]=Integer.parseInt(args[i]);
		c[0]=a[1];
		c[1]=b[1];
		for(int i=0;i<2;i++)
			System.out.print(c[i]+" ");
	}
}
