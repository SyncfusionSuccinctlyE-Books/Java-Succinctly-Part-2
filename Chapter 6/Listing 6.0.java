import java.awt.*;
import javax.swing.*;

public class MainClass extends JFrame{
	// Main method
	public static void main(String[] args) {
		MainClass mainWindow = new MainClass();
	}
	
	// Constructor
	public MainClass() {
		// Set the size of the window
		this.setSize(640,  480);
		
		// Set the app to close when the window closes
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Set the window to visible
		this.setVisible(true);
	}
}
