package model;

public class Product {
	
	protected String name, comment;
	protected int count;
	protected double price;
	
	
	public Product(String name, double price, String comment){
		this.name = name;
		this.price = price;
		this.comment = comment;
	}
	
	public double getPrice(){
		return price;
	}
}
