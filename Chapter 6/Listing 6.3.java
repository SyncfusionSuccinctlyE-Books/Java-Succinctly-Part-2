import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainClass extends JFrame implements ActionListener {
	// Main method
	public static void main(String[] args) {
		MainClass mainWindow = new MainClass();
	}
	
	// Constructor
	public MainClass() {
		// Create a JPanel
		JPanel panel = new JPanel(new FlowLayout());
		
		// Add some controls:
		panel.add(new JLabel("Test Button: "));
		JButton btnClickMe = new JButton("Click me!");
		panel.add(btnClickMe);
		
		// Set the current content pane to the panel:
		this.setContentPane(panel);
		
		// Set this as the current action listener for the button
		btnClickMe.addActionListener(this);
		
		// Set the size of the window
		this.setSize(640,  480);
		
		// Set the app to close when the window closes
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Set the window to visible
		this.setVisible(true);
	}

	// Method inherited from the ActionListener interface:
	public void actionPerformed(ActionEvent e) {
		// Show a message box:
		JOptionPane.showMessageDialog(null,
			"You clicked on the button!");
	}
}
