		btnF_12 = new JButton("M0");
		btnF_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator == 5)
					memory[0] = number1;
				else
					txtOutput.setText("" + memory[0]);
			}
		});
