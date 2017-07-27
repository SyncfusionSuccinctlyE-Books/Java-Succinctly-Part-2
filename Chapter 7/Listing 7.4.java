		button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Read number 2:
				number2 = Double.parseDouble(txtOutput.getText());

				// Result variable
				double result = 0.0;
				
				// Compute the result based on the operator:
				switch (operator) {
				case 0: result = number1 + number2; break;
				case 1: result = number1 - number2; break;
				case 2: result = number1 * number2; break;
				case 3: result = number1 / number2; break;
				
				default: result = 0.0; break;
				}
				
				// Save the result to the output
				txtOutput.setText("" + result);
			}
		});
