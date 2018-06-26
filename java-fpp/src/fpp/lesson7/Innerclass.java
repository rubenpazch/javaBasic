package lesson7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Day7.MyFrameAnonymous;

public class Innerclass extends JFrame {


	public static void main(String args[]){
		JFrame frame = new JFrame("Demo application");
		frame.setSize(550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}
	private static void placeComponents(JFrame frame) {
		frame.setLayout(null);

		//MILES
		JLabel lblMiles = new JLabel("Mile:");
		lblMiles.setBounds(20, 40, 80, 25);
		frame.add(lblMiles);

		JTextField txtMiles = new JTextField(20);
		txtMiles.setBounds(90, 40, 160, 25);
		frame.add(txtMiles);

		//POUNDS
		JLabel lblPounds = new JLabel("Pound:");
		lblPounds.setBounds(20, 80, 80, 25);
		frame.add(lblPounds);

		JTextField txtPounds = new JTextField(20);
		txtPounds.setBounds(90, 80, 160, 25);
		frame.add(txtPounds);

		//GALLONS
		JLabel lblGallons = new JLabel("Gallon:");
		lblGallons.setBounds(20, 120, 80, 25);
		frame.add(lblGallons);

		JTextField txtGallons = new JTextField(20);
		txtGallons.setBounds(90, 120, 160, 25);
		frame.add(txtGallons);

		//FAHRENHEIT
		JLabel lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setBounds(20, 160, 80, 25);
		frame.add(lblFahrenheit);

		JTextField txtFahrenheit = new JTextField(20);
		txtFahrenheit.setBounds(90, 160, 160, 25);
		frame.add(txtFahrenheit);





		//KILOMETER
		JLabel lblKilometer = new JLabel("Kilometer:");
		lblKilometer.setBounds(270, 40, 80, 25);
		frame.add(lblKilometer);

		JTextField txtKilometer = new JTextField(20);
		txtKilometer.setBounds(350, 40, 160, 25);
		frame.add(txtKilometer);

		//KILOGRAM
		JLabel lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setBounds(270, 80, 80, 25);
		frame.add(lblKilogram);

		JTextField txtKilogram = new JTextField(20);
		txtKilogram.setBounds(350, 80, 160, 25);
		frame.add(txtKilogram);

		//LITERS		LT.
		JLabel lblLiters = new JLabel("Liters:");
		lblLiters.setBounds(270, 120, 80, 25);
		frame.add(lblLiters);

		JTextField txtLiters = new JTextField(20);
		txtLiters.setBounds(350, 120, 160, 25);
		frame.add(txtLiters);

		//CENTIGRADE
		JLabel lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setBounds(270, 160, 80, 25);
		frame.add(lblCentigrade);

		JTextField txtCentigrade = new JTextField(20);
		txtCentigrade.setBounds(350, 160, 160, 25);
		frame.add(txtCentigrade);




		//BUTTONS
		JButton btConverte = new JButton("Convert");
		btConverte.setBounds(220, 220, 160, 25);
		frame.add(btConverte);


		btConverte.addActionListener(evt -> {

			String sMiles = new String((txtMiles.getText()));

			if(sMiles != null && sMiles.length()!=0 )
			{				
				double dMiles = Double.parseDouble(sMiles);
				double dKilometers= dMiles/0.62137;			
				txtKilometer.setText(String.format("%.2f", dKilometers));
			}
			String sPound = new String((txtPounds.getText()));

			if(sPound != null && sPound.length()!=0 )
			{
				double dPounds = Double.parseDouble(sPound);
				double dKilogram= dPounds*0.45359237;			
				txtKilogram.setText(String.format("%.2f", dKilogram));
			}

			String sGallon = new String((txtGallons.getText()));

			if(sGallon != null && sGallon.length()!=0 )
			{
				double dGallons = Double.parseDouble(sGallon);
				double dLiters= dGallons*3.785411784;			
				txtLiters.setText(String.format("%.2f", dLiters));
			}

			String sFahrenheit = new String((txtFahrenheit.getText()));

			if(sFahrenheit != null && sFahrenheit.length()!=0 )
			{
				double dFahrenheit = Double.parseDouble(sFahrenheit);
				double dCentigrades= (dFahrenheit-32)*5/9;			
				txtCentigrade.setText(String.format("%.2f", dCentigrades));
			}


		}
				);

	}

}
