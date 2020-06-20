package com.wipro.arrays;

public class Ex11 {
	public static void main(String[] args) {
		int l=args.length;
		int a[]=new int[l];
		for(int i=0;i<l;i++)
			a[i]=Integer.parseInt(args[i]);
		int flag=0;
		for(int i=0;i<l;i++) {
			if(a[i]!=1 && a[i]!=4) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("false");
		else
			System.out.println("true");
	}
}
