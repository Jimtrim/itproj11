package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Customer;
import model.OrderSystem;

// Admittedly very shitty code :P
public class RegistrationPanel extends JPanel {
	public static JFrame frame = new JFrame();
	
	LookupCustomerPanel lookupCustomerPanel = new LookupCustomerPanel();
	EditCustomerPanel editCustomerPanel = new EditCustomerPanel();
	DeliveryPanel deliveryPanel = new DeliveryPanel();
	
	JPanel activePanel;
	
	public static void main(String[] args){
		frame.add(new RegistrationPanel());
		frame.pack();
		frame.setTitle(OrderSystem.name);
		frame.setVisible(true);
	}
	
	private void switchPanel(JPanel panel){
		if (activePanel!=null) activePanel.setVisible(false);
		panel.setVisible(true);
		activePanel = panel;
		frame.pack();
	}
	
	public RegistrationPanel(){
		final JPanel cards = new JPanel();
		
		lookupCustomerPanel.setVisible(false);
		editCustomerPanel.setVisible(false);
		deliveryPanel.setVisible(false);
		
		cards.add(lookupCustomerPanel);
		cards.add(editCustomerPanel);
		cards.add(deliveryPanel);
		
		add(cards);
		
		switchPanel(lookupCustomerPanel);
		
		JButton nextButton = new JButton("Ok");
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (activePanel == lookupCustomerPanel){
					Customer c = lookupCustomerPanel.getCustomer();
					editCustomerPanel.setCustomer(c);
					switchPanel(editCustomerPanel);
				}
			}
		});
		add(nextButton);
		
		//Map map = new Map(OrderSystem.location, "Gløshaugen, Trondheim");
		//add(map);
	}
}
