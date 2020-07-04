package com.wipro.ExceptionHandling;
import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int n=sc.nextInt();
			System.out.println("Enter the elements in the array");
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int k=sc.nextInt();
			System.out.println("The array element at index "+k+" ="+a[k]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException e2) {
			System.out.println(e2);
		}
	}
}
