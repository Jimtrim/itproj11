package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.OrderSystem;

public class DeliveryPanel extends JPanel{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setContentPane(new DeliveryPanel());
		frame.pack();
		frame.setTitle(OrderSystem.name);
		frame.setVisible(true);
	}
	
	public DeliveryPanel(){
		MapPanel mapPanel = new MapPanel(OrderSystem.location, "Volveveien 11A, Trondheim");
		add(mapPanel);
	}
}
