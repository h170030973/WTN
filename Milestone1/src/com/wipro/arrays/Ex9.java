package com.wipro.arrays;

public class Ex9 {
	public static void main(String[] args) {
		int l=args.length;
		int a[]=new int[l];
		int c=0;
		for(int i=0;i<l;i++) {
			a[i]=Integer.parseInt(args[i]);
			if(a[i]==10)
				c++;
		}
		for(int i=0;i<l;i++) {
			if(a[i]!=10)
				System.out.print(a[i]+" ");
		}
		for(int i=0;i<c;i++)
			System.out.print("0"+" ");
	}
}
