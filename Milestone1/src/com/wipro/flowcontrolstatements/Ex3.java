package com.wipro.flowcontrolstatements;

public class Ex3 {
	public static void main(String args[]) {
		if(args.length==0)
			System.out.println("No values");
		else {
			int l=args.length;
			if(l==1)
				System.out.println(args[0]);
			else {
				for(int i=0;i<l-1;i++)
					System.out.print(args[i]+",");
				System.out.println(args[l-1]);
			}
		}
	}
}
