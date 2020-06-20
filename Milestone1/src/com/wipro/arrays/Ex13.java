package com.wipro.arrays;

public class Ex13 {
	public static void main(String[] args) {
		int l=args.length;
		if(l!=4)
			System.out.println("Plaese eneter 4 integer numbers");
		else {
			System.out.println("The given array is:");
			int k=0;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) 
					System.out.print(Integer.parseInt(args[k++])+" ");
				System.out.println();
			}
			System.out.println("The reverse of the array is:");
			int k1=3;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) 
					System.out.print(Integer.parseInt(args[k1--])+" ");
				System.out.println();
			}
		}
	}
}
