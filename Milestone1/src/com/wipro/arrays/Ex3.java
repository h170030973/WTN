package com.wipro.arrays;

public class Ex3 {
	public static void main(String args[]) {
		int l=args.length;
		int []a=new int[l-2];
		for(int i=0;i<l-2;i++)
			a[i]=Integer.parseInt(args[i]);
		int key=Integer.parseInt(args[l-1]);
		int c=0;
		for(int i=0;i<l-2;i++) {
			if(a[i]==key) {
				c=1;
				System.out.println("Element found at index: "+i);
				break;
			}
		}
		if(c==0)
			System.out.println("-1");
	}
}
