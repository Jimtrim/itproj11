package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Customer;

public class LookupCustomerPanel extends JPanel {
	private JLabel tlfLabel = new JLabel("Tlf:");
	private JTextField tlfInput = new JTextField();
	
	public LookupCustomerPanel(){
		tlfInput.setColumns(10);
		
		add(tlfLabel);
		add(tlfInput);
	}

	public Customer getCustomer() {
		return new Customer("","",tlfInput.getText());
	}
}
