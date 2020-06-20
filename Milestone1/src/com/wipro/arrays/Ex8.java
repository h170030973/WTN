package com.wipro.arrays;

public class Ex8 {
	public static void main(String args[]) {
		int l=args.length;
		int a[]=new int[l];
		int ind1=-1,ind2=-1,sum=0;
		for(int i=0;i<l;i++) {
			a[i]=Integer.parseInt(args[i]);
			if(a[i]==6)
				ind1=i;
			if(a[i]==7)
				ind2=i;
		}
		if(ind1==-1 || ind2==-1 || ind1>ind2) {
			for(int i=0;i<l;i++)
				sum+=a[i];
		}
		else {
			for(int i=0;i<ind1;i++)
				sum+=a[i];
			for(int i=ind2+1;i<l;i++)
				sum+=a[i];
		}
		System.out.println("Sum: "+sum);
	}
}
