		btnF = new JButton("SIN");
		btnF.setToolTipText("Compute the Sine of an angle");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			number1 = Double.parseDouble(txtOutput.getText());
			number1 = Math.sin(number1);
			txtOutput.setText("" + number1);
			}
		});
