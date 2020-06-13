package com.wipro.flowcontrolstatements;

public class Ex13 {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		for(int i=a;i<=b;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.println(i);
		}
	}
}
