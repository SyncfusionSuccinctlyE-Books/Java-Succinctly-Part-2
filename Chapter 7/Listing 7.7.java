		btnF = new JButton("SIN");
		btnF_3 = new JButton("^");
		btnF_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operator = 4;	// 4 is power
				number1 = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
			}
		});
