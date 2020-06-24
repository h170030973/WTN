package com.wipro.polymorphism;

public class Orange extends Fruit {
	String name="Orange";
	String taste="Sweet & Bitter";
	void eat() {
		System.out.println("Name of the fruit is: "+name);
		System.out.println("Taste of fruit is: "+taste);
	}
}
