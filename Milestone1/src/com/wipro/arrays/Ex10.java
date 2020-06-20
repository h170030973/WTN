package com.wipro.arrays;

public class Ex10 {
	public static void main(String[] args) {
		int l=args.length;
		int a[]=new int[l];
		for(int i=0;i<l;i++) 
			a[i]=Integer.parseInt(args[i]);
		for(int i=0;i<l;i++) {
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
		for(int i=0;i<l;i++)
			if(a[i]%2==1)
				System.out.print(a[i]+" ");
	}
}
