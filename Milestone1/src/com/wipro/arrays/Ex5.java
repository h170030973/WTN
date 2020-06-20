package com.wipro.arrays;

public class Ex5 {
	public static void main(String args[]) {
		int l=args.length,i;
		int a[]=new int[l];
		for(i=0;i<l;i++)
			a[i]=Integer.parseInt(args[i]);
		int max1=a[0],max2=0,min1=a[0],min2=9999,ind1=0,ind2=0;
		for(i=1;i<l;i++) {
			if(a[i]<min1) {
				min1=a[i];
				ind1=i;
			}
		}
		for(i=0;i<l;i++) {
			if(i!=ind1) {
				if(a[i]<min2) 
					min2=a[i];
			}
		}
		for(i=1;i<l;i++) {
			if(a[i]>max1) {
				max1=a[i];
				ind2=i;
			}
		}
		for(i=0;i<l;i++) {
			if(i!=ind2) {
				if(a[i]>max2) {
					max2=a[i];
				}
			}
		}
		System.out.println("1st minimum element in array: "+min1);
		System.out.println("2nd minimum element in array: "+min2);
		System.out.println("1st maximum element in array: "+max1);
		System.out.println("2nd maximum element in array: "+max2);
	}
}
