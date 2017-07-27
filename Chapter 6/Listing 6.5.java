import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainClass extends JFrame implements ActionListener {
	public static void main(String[] args) {
		MainClass m = new MainClass();
		m.run();
	}

	// Declare txtInput
	private JTextArea txtInput;
	
	private void run() {
		// Create a new border layout and main panel for controls
		BorderLayout layoutManager = new BorderLayout();
		JPanel mainPanel = new JPanel(layoutManager);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,  500);
		this.setContentPane(mainPanel);
		this.setVisible(true);
		
		// Set margins around control in layout
		layoutManager.setHgap(25);
		layoutManager.setVgap(25);
				
		// Create buttons
		JButton btnTop = new JButton("Page Start");
		JButton btnBottom = new JButton("Page End");
		JButton btnLeft = new JButton("Line Start");
		JButton btnRight = new JButton("Line End");
		
		// Add the buttons to panel
		mainPanel.add(btnTop, BorderLayout.PAGE_START);
		mainPanel.add(btnBottom, BorderLayout.PAGE_END);
		mainPanel.add(btnLeft, BorderLayout.LINE_START);
		mainPanel.add(btnRight, BorderLayout.LINE_END);
		
		// Create and add a text area
		txtInput = new JTextArea(5, 10);
		txtInput.setText("Click a button!");
		JScrollPane jsp = new JScrollPane(txtInput);
		txtInput.setEditable(false);
		mainPanel.add(jsp, BorderLayout.CENTER);
		
		// Add action listeners to respond to button clicks
		btnTop.addActionListener(this);
		btnBottom.addActionListener(this);
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);

		// Redraw all controls to ensure all are visible
		this.validate();
	}

	// Action performed prints the clicked button's text to the
	// txtOutput control
	public void actionPerformed(ActionEvent arg0) {
		txtInput.append("You clicked " +
				((JButton)arg0.getSource()).getText() +
				"\n");
	}
}
