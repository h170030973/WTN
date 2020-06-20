package com.wipro.ClassesAndObjects;
class Box{
	double length,breadth,height;
	Box(double length,double breadth,double height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	double volume() {
		return length*breadth*height;
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Box b=new Box(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
		System.out.println(b.volume());
	}
}
