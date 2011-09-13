package model;
import java.util.ArrayList;


public class OrderSystem {
	public static String location = "Festningen, trondheim";
	public static String name = "Festningen Pizza!";
	
	public Customer getCustomer(String name){
		Customer customer = new Customer(name, "Volveveien 11A, Trondheim", "8471223");
		return customer;
	}
	
	public ArrayList<Product> getProducts(){
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("Fiskeboller",38,""));
		products.add(new Product("Lapskaus",57,""));
		products.add(new Product("Faarikaal",98, "Digg!"));
		return products;
	}
	
	public ArrayList<Order> getUntakenOrders(){
		return null;
	}
}
