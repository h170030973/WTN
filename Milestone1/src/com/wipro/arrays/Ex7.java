package com.wipro.arrays;

public class Ex7 {
	public static void main(String args[]) {
		int l=args.length;
		int a[]=new int[l];
		int b[]=new int[l];
		for(int i=0;i<l;i++) {
			a[i]=Integer.parseInt(args[i]);
			b[i]=0;
		}
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[j]==a[i]) {
					b[j]=1;
				}
			}
		}
		for(int i=0;i<l;i++) {
			if(b[i]==0)
				System.out.print(a[i]+" ");
		}
	}
}
