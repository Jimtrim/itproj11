package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Customer;

public class EditCustomerPanel extends JPanel {
	JLabel nameLabel = new JLabel("Navn:");
	JTextField nameInput = new JTextField();
	JLabel addressLabel = new JLabel("Adresse:");
	JTextField addressInput = new JTextField();
	JLabel tlfLabel = new JLabel("Tlf:"); 
	JTextField tlfInput = new JTextField();
	
	public EditCustomerPanel(){
		nameInput.setColumns(10);
		addressInput.setColumns(10);
		tlfInput.setColumns(10);
		
		add(nameLabel); add(nameInput);
		add(addressLabel); add(addressInput);
		add(tlfLabel); add(tlfInput);
	}
	
	public void setCustomer(Customer customer){
		nameInput.setText(customer.getName());
		addressInput.setText(customer.getAddress());
		tlfInput.setText(customer.getTlf());
	}
	
	public Customer getCustomer(Customer customer){
		String name = nameInput.getText();
		String address = addressInput.getText();
		String tlf = tlfInput.getText();
		return new Customer(name, address, tlf);
	}
}
