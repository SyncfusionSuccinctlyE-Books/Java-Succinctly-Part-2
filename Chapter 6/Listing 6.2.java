		JButton btn = new JButton("Initial Text");
		
		// Useful control methods:
		btn.setText("New text!");	// Set the text on the button
		String text = btn.getText();	// Read the current text
		btn.setVisible(false);	// Hide the control from view
		btn.setVisible(true);	// Show the control
		btn.setMargin(new Insets(100, 100, 100, 100)); // Set margins
		Dimension dim = btn.getSize();// Read the size of the control
		btn.setBackground(Color.BLUE);// Set the background color
		btn.setForeground(Color.WHITE);// Set the foreground/text color
		btn.setEnabled(false);// Disable interactions with the control
		btn.setEnabled(true); // Enable interactions with the control
		
		// Depending on the layout manager, these may do nothing:
		btn.setSize(new Dimension(10, 10));	// Set size of the control
		
		// Set size and position of the control:
		btn.setBounds(new Rectangle(20, 20, 200, 60));
