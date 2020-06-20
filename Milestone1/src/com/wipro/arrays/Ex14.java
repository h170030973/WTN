package com.wipro.arrays;

public class Ex14 {
	public static void main(String[] args) {
		int l=args.length;
		if(l!=9)
			System.out.println("Please enter 9 integer numbers");
		else {
			int k=0,i,j;
			int a[][]=new int[l][l];
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++)
					a[i][j]=Integer.parseInt(args[k++]);
			}
			System.out.println("The given array is:");
			int max=0;
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					if(a[i][j]>max)
						max=a[i][j];
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The biggest number in the given array is "+max);
		}
	}
}
