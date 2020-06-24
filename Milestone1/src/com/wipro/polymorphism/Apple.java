package com.wipro.polymorphism;

public class Apple extends Fruit {
	String name="Apple";
	String taste="Little sour & bitter,but mostly sweet";
	void eat() {
		System.out.println("Name of the fruit is: "+name);
		System.out.println("Taste of fruit is: "+taste);
	}
}
