package com.wipro.AbstractClasses;
import java.util.*;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
		return "First Class Compartment";
	}
}
class Ladies extends Compartment{
	public String notice() {
		return "Ladies Compartment";
	}
}
class General extends Compartment{
	public String notice() {
		return "General Compartment";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "Luggage Compartment";
	}
}
public class TestCompartment {
	public static void main(String[] args) {
		Compartment c[]=new Compartment[10];
		Random r=new Random();
		for(int i=0;i<10;i++) {
			int rndInteger=r.nextInt((4-1)+1)+1;
			if(rndInteger==1)
				c[i]=new FirstClass();
			else if(rndInteger==2)
				c[i]=new Ladies();
			else if(rndInteger==3)
				c[i]=new General();
			else c[i]=new Luggage();
			System.out.println(c[i].notice());
		}
	}
}
