package Day7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrameAnonymous extends JFrame {

	JLabel label;
	JTextField text;

	 public static void main(String args[]){
		 MyFrameAnonymous obj = new MyFrameAnonymous();
	 }
	public MyFrameAnonymous() {
		// initializeWindow();
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel();

		text = new JTextField(10);
		label = new JLabel("My Text");
		final JButton button = new JButton("My Button");

		// Registering an ActionListener with button using an anonymous inner
		// class
		
		/*button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("Button height = " + button.getSize().height);
				text.setText("button press");
			}
		});*/
		// Registering an ActionListener with button using an anonymous inner class using Lambdas
		button.addActionListener(evt -> {
			System.out.println("Button height = " + button.getSize().height);
			text.setText("button press");
			}
  );
		mainPanel.add(text);
		mainPanel.add(label);
		mainPanel.add(button);
		frame.add(mainPanel);
		frame.setVisible(true);
		 frame.setTitle("AnonymousListenerDemo using Lamdas");
		 frame.setLocationRelativeTo(null); // Center the frame
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().add(mainPanel);
	}

}