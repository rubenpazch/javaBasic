package lesson7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrameAnonymous extends JFrame {

	JTextField txtMiles;	
	JLabel lblMiles;
	 public static void main(String args[]){
		 MyFrameAnonymous obj = new MyFrameAnonymous();
	 }
	 public MyFrameAnonymous() {
		// initializeWindow();
		JFrame frame = new JFrame();	
		JPanel mainPanel = new JPanel();
		
		
		
		//frame.setVisible(true);
		//frame.setLayout(null);
		//frame.setTitle("AnonymousListenerDemo using Lamdas");
		//frame.setLocationRelativeTo(null); // Center the frame
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	

		//MILES
		lblMiles = new JLabel("Mile:");
		lblMiles.setBounds(20, 40, 80, 25);
		mainPanel.add(lblMiles);
		
		txtMiles = new JTextField(20);
		txtMiles.setBounds(90, 40, 160, 25);
		mainPanel.add(txtMiles);
		
		//POUNDS
		JLabel lblPounds = new JLabel("Pound:");
		lblPounds.setBounds(20, 80, 80, 25);
		mainPanel.add(lblPounds);
		
		JTextField txtPounds = new JTextField(20);
		txtPounds.setBounds(90, 80, 160, 25);
		mainPanel.add(txtPounds);
		
		//GALLONS
		JLabel lblGallons = new JLabel("Gallon:");
		lblGallons.setBounds(20, 120, 80, 25);
		mainPanel.add(lblGallons);
		
		JTextField txtGallons = new JTextField(20);
		txtGallons.setBounds(90, 120, 160, 25);
		mainPanel.add(txtGallons);
		
		//FAHRENHEIT
		JLabel lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setBounds(20, 160, 80, 25);
		mainPanel.add(lblFahrenheit);
		
		JTextField txtFahrenheit = new JTextField(20);
		txtFahrenheit.setBounds(90, 160, 160, 25);
		mainPanel.add(txtFahrenheit);
		
		
		
		
		
		//KILOMETER
		JLabel lblKilometer = new JLabel("Kilometer:");
		lblKilometer.setBounds(270, 40, 80, 25);
		mainPanel.add(lblKilometer);
		
		JTextField txtKilometer = new JTextField(20);
		txtKilometer.setBounds(350, 40, 160, 25);
		mainPanel.add(txtKilometer);
		
		//KILOGRAM
		JLabel lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setBounds(270, 80, 80, 25);
		mainPanel.add(lblKilogram);
		
		JTextField txtKilogram = new JTextField(20);
		txtKilogram.setBounds(350, 80, 160, 25);
		mainPanel.add(txtKilogram);
		
		//LITERS		LT.
		JLabel lblLiters = new JLabel("Liters:");
		lblLiters.setBounds(270, 120, 80, 25);
		mainPanel.add(lblLiters);
		
		JTextField txtLiters = new JTextField(20);
		txtLiters.setBounds(350, 120, 160, 25);
		mainPanel.add(txtLiters);
		
		//CENTIGRADE
		JLabel lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setBounds(270, 160, 80, 25);
		mainPanel.add(lblCentigrade);
		
		JTextField txtCentigrade = new JTextField(20);
		txtCentigrade.setBounds(350, 160, 160, 25);
		mainPanel.add(txtCentigrade);
		
		//BUTTONS
		JButton btConverte = new JButton("Count Letters");
		btConverte.setBounds(220, 220, 160, 25);
		mainPanel.add(btConverte);
		
		frame.add(mainPanel);
		frame.setVisible(true);
		 frame.setTitle("AnonymousListenerDemo using Lamdas");
		 frame.setLocationRelativeTo(null); // Center the frame
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //frame.setSize(800, 200);
		/*
		btConverte.addActionListener(evt -> {
			
			
			
			}
		);
		*/
		
	}	
}
