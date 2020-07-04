package com.wipro.ExceptionHandling;
import java.util.*;
public class MathOperation {
	public static void main(String[] args) throws Exception{
		try {
			int n=Integer.parseInt(args[0]);
			int a[]=new int[n];
			int sum=0;
			double avg;
			for(int i=0;i<n;i++) {
				a[i]=Integer.parseInt(args[i+1]);
				sum+=a[i];
			}
			avg=sum/n;
			System.out.println("Sum: "+sum);
			System.out.println("Averge: "+avg);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
	}
}
