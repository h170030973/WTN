package com.wipro.Encapsulation;
class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getAuthorName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
}
class Book{
	String name;
	Author author;
	double price;
	int qtyInStock;
	Book(String name,double price,int qtyInStock){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Author a=new Author("pooji","abc@gmail.com",'F');
		Book b=new Book("XYZ",188.90,3);
		b.setAuthor(a);
		System.out.println("Book name:"+b.getName());
		System.out.println("Author name:"+b.getAuthor().getAuthorName());
		System.out.println("Author email:"+b.getAuthor().getEmail());
		System.out.println("Author gender:"+b.getAuthor().getGender());
		System.out.println("Book price:"+b.getPrice());
		System.out.println("Book stock(qty):"+b.getQtyInStock());
	}
}
