		button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 0;
				number1 = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
			}
		});
