package model;
import java.util.ArrayList;


public class Order extends ArrayList<Product>{
	public static double VAT = 0.25;
	public static double deliveryCost = 100;
	public static double freeDeliveryLimit = 500;
	
	protected Customer customer;
	protected boolean beDelivered;
	protected boolean isDelivered;
	protected boolean taken;
	
	public double getPrice(){
		double price = 0;
		for (Product product : this){
			price += product.getPrice();
		}
		return price;
	}
	
	public double getVAT(double price){
		return price * VAT;
	}
	
	public double getDeliveryCost(double price){
		if (beDelivered && price <= freeDeliveryLimit) return deliveryCost;
		return 0;
	}
	
	public double getTotalCost(){
		double price = getPrice();
		double vat = getVAT(price);
		double delivery = getDeliveryCost(price);
		return price+vat+delivery;
	}
	
	public String getReciept(){
		String reciept = "";
		for (Product product : this){
			reciept += product.name + "\t" + product.getPrice() + ",-\n"; 
		}
		double price = getPrice();
		double delivery = getDeliveryCost(price);
		double vat = getVAT(price);
		reciept += "+DELIVERY\t" + delivery +",-\n";
		reciept += "=TOTAL\t" + (price+delivery) + ",-\n";
		reciept += "+VAT\t" + vat + ",-\n";
		reciept += "=TO PAY\t" + (price+delivery+vat) + ",-\n";
		
		return reciept;
	}
}
