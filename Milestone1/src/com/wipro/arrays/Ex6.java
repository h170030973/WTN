package com.wipro.arrays;

public class Ex6 {
	public static void main(String args[]) {
		int l=args.length;
		int a[]=new int[l];
		for(int i=0;i<l;i++)
			a[i]=Integer.parseInt(args[i]);
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<l;i++)
			System.out.print(a[i]+" ");
	}
}
