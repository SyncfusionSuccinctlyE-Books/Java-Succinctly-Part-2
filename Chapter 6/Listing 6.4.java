import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainClass extends JFrame {
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
		
		// ActionListener as anonymous class:
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Show a message box:
				JOptionPane.showMessageDialog(null,
					"You clicked on the button!");
			}
		});
		
		// Set the size of the window
		this.setSize(640,  480);
		
		// Set the app to close when the window closes
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Set the window to visible
		this.setVisible(true);
	}
}
