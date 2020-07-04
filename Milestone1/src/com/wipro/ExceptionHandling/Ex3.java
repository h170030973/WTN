package com.wipro.ExceptionHandling;
import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		for(int i=0;i<2;i++) {
			String name="";
			int sub1=0,sub2=0,sub3=0;
			try {
			Scanner sc=new Scanner(System.in);
			name=sc.nextLine();
			if(sc.hasNextInt())
				sub1=sc.nextInt();
			else
				throw new NumberFormatException();
			if(sc.hasNextInt())
				sub2=sc.nextInt();
			else
				throw new NumberFormatException();
			if(sc.hasNextInt())
				sub3=sc.nextInt();
			else
				throw new NumberFormatException();
			if(sub1<0)
				throw new NegativeValuesException();
			if(sub1>100)
				throw new ValuesOutOfRangeException();
			if(sub2<0)
				throw new NegativeValuesException();
			if(sub2>100)
				throw new ValuesOutOfRangeException();
			if(sub3<0)
				throw new NegativeValuesException();
			if(sub3>100)
				throw new ValuesOutOfRangeException();
			}
			catch(ArithmeticException ae) {
				System.out.println(ae.getMessage());
			}
			catch(NegativeValuesException e) {
				System.out.println(e.getMessage());
			}
			catch(ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: "+name);
			System.out.println("Marks in subject 1: "+sub1);
			System.out.println("Marks in subject 2: "+sub2);
			System.out.println("Marks in subject 3: "+sub3);
		}
	}
}
