package com.wipro.polymorphism;
class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing Triangle");
	}
	void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.erase();
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		Square s=new Square();
		s.draw();
		s.erase();
	}
}
