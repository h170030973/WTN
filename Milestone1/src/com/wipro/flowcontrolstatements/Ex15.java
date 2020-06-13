package com.wipro.flowcontrolstatements;

public class Ex15 {
	public static void main(String args[]) {
		if(args.length==0)
			System.out.println("Please enter an integer number");
		else {
			int n=Integer.parseInt(args[0]);
			int j;
			for(int i=1;i<=n;i++) {
				j=i;
				while(j!=0) {
					System.out.print("* ");
					j--;
				}
				System.out.println();
			}
		}
	}
}
