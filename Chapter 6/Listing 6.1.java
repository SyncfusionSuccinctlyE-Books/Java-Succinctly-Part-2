	// Constructor
	public MainClass() {
		// Create a JPanel
		JPanel panel = new JPanel(new FlowLayout());
		
		// Add some controls:
		panel.add(new JLabel("Test Button: "));
		panel.add(new JButton("Click me!"));
		
		// Set the current content pane to the panel:
		this.setContentPane(panel);
		
		
		// Set the size of the window
		this.setSize(640,  480);
		
		// Set the app to close when the window closes
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Set the window to visible
		this.setVisible(true);
	}
