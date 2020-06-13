package com.wipro.flowcontrolstatements;

public class Ex14 {
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		int sum=0,m=n;
		for(int i=m;i>0;i++) {
			int r=m%10;
			sum+=r;
			m/=10;
		}
		System.out.println(sum);
	}
}
