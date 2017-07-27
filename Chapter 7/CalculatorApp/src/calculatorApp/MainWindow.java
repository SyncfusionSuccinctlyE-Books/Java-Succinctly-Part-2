package calculatorApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class MainWindow {

	private JFrame frame;
	private JTextField txtOutput;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton btnX;
	private JButton button_13;
	private JButton button_14;
	private JButton btnF;
	private JButton btnF_1;
	private JButton btnF_2;
	private JButton btnF_3;
	private JButton btnF_5;
	private JButton btnF_6;
	private JButton btnF_7;
	private JButton btnF_8;
	private JButton btnF_4;
	private JButton btnF_9;
	private JButton btnF_10;
	private JButton btnF_11;
	private JButton btnF_12;
	private JButton btnF_13;
	private JButton btnF_14;
	private JButton btnF_15;
	private JButton btnF_16;
	private JButton btnF_17;

	// State variables
	private int state = 0;		// 0 to first number, 1 for second
	private int operator = 0;	// 0 means unknown
	private double number1 = 0.0;	// Variable for parsing 1st operand
	private double number2 = 0.0;	// Variable for parsing 2nd operand
	private double[] memory = new double[5]; // For memory functions
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		txtOutput = new JTextField();
		txtOutput.setHorizontalAlignment(SwingConstants.TRAILING);
		txtOutput.setEditable(false);
		txtOutput.setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().add(txtOutput, BorderLayout.NORTH);
		txtOutput.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {30, 30, 0, 0, 0, 0, 30, 30, 30, 30};
		gbl_panel.rowHeights = new int[]    {50, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		btnF = new JButton("SIN");
		btnF.setToolTipText("Compute the Sine of an angle");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			number1 = Double.parseDouble(txtOutput.getText());
			number1 = Math.sin(number1);
			txtOutput.setText("" + number1);
			}
		});
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF = new GridBagConstraints();
		gbc_btnF.fill = GridBagConstraints.BOTH;
		gbc_btnF.insets = new Insets(0, 0, 5, 5);
		gbc_btnF.gridx = 2;
		gbc_btnF.gridy = 1;
		panel.add(btnF, gbc_btnF);
		
		btnF_1 = new JButton("COS");
		btnF_1.setToolTipText("Compute the Cosine of an angle");
		btnF_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_1 = new GridBagConstraints();
		gbc_btnF_1.fill = GridBagConstraints.BOTH;
		gbc_btnF_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_1.gridx = 3;
		gbc_btnF_1.gridy = 1;
		panel.add(btnF_1, gbc_btnF_1);
		
		btnF_2 = new JButton("TAN");
		btnF_2.setToolTipText("Compute the Tangent of an angle");
		btnF_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_2 = new GridBagConstraints();
		gbc_btnF_2.fill = GridBagConstraints.BOTH;
		gbc_btnF_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_2.gridx = 4;
		gbc_btnF_2.gridy = 1;
		panel.add(btnF_2, gbc_btnF_2);
		
		btnF_3 = new JButton("^");
		btnF_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operator = 4;	// 4 is power
				number1 = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
			}
		});
		btnF_3.setToolTipText("Computes the power of one number to another");
		btnF_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_3 = new GridBagConstraints();
		gbc_btnF_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_3.gridx = 5;
		gbc_btnF_3.gridy = 1;
		panel.add(btnF_3, gbc_btnF_3);
		
		btnF_4 = new JButton("f");
		btnF_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_4 = new GridBagConstraints();
		gbc_btnF_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_4.gridx = 6;
		gbc_btnF_4.gridy = 1;
		panel.add(btnF_4, gbc_btnF_4);
		
		btnF_10 = new JButton("f");
		btnF_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_10 = new GridBagConstraints();
		gbc_btnF_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_10.gridx = 7;
		gbc_btnF_10.gridy = 1;
		panel.add(btnF_10, gbc_btnF_10);
		
		btnF_5 = new JButton("STR");
		btnF_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 5;
				number1 = Double.parseDouble(txtOutput.getText());
			}
		});
		btnF_5.setToolTipText("Store the current value to a memory");
		btnF_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_5 = new GridBagConstraints();
		gbc_btnF_5.fill = GridBagConstraints.BOTH;
		gbc_btnF_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_5.gridx = 2;
		gbc_btnF_5.gridy = 2;
		panel.add(btnF_5, gbc_btnF_5);
		
		btnF_6 = new JButton("f");
		btnF_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_6 = new GridBagConstraints();
		gbc_btnF_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_6.gridx = 3;
		gbc_btnF_6.gridy = 2;
		panel.add(btnF_6, gbc_btnF_6);
		
		btnF_7 = new JButton("f");
		btnF_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_7 = new GridBagConstraints();
		gbc_btnF_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_7.gridx = 4;
		gbc_btnF_7.gridy = 2;
		panel.add(btnF_7, gbc_btnF_7);
		
		btnF_8 = new JButton("f");
		btnF_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_8 = new GridBagConstraints();
		gbc_btnF_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_8.gridx = 5;
		gbc_btnF_8.gridy = 2;
		panel.add(btnF_8, gbc_btnF_8);
		
		btnF_9 = new JButton("f");
		btnF_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_9 = new GridBagConstraints();
		gbc_btnF_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_9.gridx = 6;
		gbc_btnF_9.gridy = 2;
		panel.add(btnF_9, gbc_btnF_9);
		
		btnF_11 = new JButton("f");
		btnF_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_11 = new GridBagConstraints();
		gbc_btnF_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_11.gridx = 7;
		gbc_btnF_11.gridy = 2;
		panel.add(btnF_11, gbc_btnF_11);
		
		btnF_12 = new JButton("M0");
		btnF_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator == 5)
					memory[0] = number1;
				else
					txtOutput.setText("" + memory[0]);
			}
		});
		btnF_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_12 = new GridBagConstraints();
		gbc_btnF_12.fill = GridBagConstraints.BOTH;
		gbc_btnF_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_12.gridx = 2;
		gbc_btnF_12.gridy = 3;
		panel.add(btnF_12, gbc_btnF_12);
		
		btnF_13 = new JButton("M1");
		btnF_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_13 = new GridBagConstraints();
		gbc_btnF_13.fill = GridBagConstraints.BOTH;
		gbc_btnF_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_13.gridx = 3;
		gbc_btnF_13.gridy = 3;
		panel.add(btnF_13, gbc_btnF_13);
		
		btnF_14 = new JButton("M2");
		btnF_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_14 = new GridBagConstraints();
		gbc_btnF_14.fill = GridBagConstraints.BOTH;
		gbc_btnF_14.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_14.gridx = 4;
		gbc_btnF_14.gridy = 3;
		panel.add(btnF_14, gbc_btnF_14);
		
		btnF_15 = new JButton("M3");
		btnF_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_15 = new GridBagConstraints();
		gbc_btnF_15.fill = GridBagConstraints.BOTH;
		gbc_btnF_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_15.gridx = 5;
		gbc_btnF_15.gridy = 3;
		panel.add(btnF_15, gbc_btnF_15);
		
		btnF_16 = new JButton("M4");
		btnF_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_btnF_16 = new GridBagConstraints();
		gbc_btnF_16.fill = GridBagConstraints.BOTH;
		gbc_btnF_16.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_16.gridx = 6;
		gbc_btnF_16.gridy = 3;
		panel.add(btnF_16, gbc_btnF_16);
		
		btnF_17 = new JButton("C");
		btnF_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			txtOutput.setText("");
			operator = -1;
			}
		});
		btnF_17.setToolTipText("Clear the output");
		btnF_17.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnF_17 = new GridBagConstraints();
		gbc_btnF_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnF_17.insets = new Insets(0, 0, 5, 5);
		gbc_btnF_17.gridx = 7;
		gbc_btnF_17.gridy = 3;
		panel.add(btnF_17, gbc_btnF_17);
		
		button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtOutput.setText(txtOutput.getText() + "7");
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 7;
		panel.add(button, gbc_button);
		
		button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "8");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 7;
		panel.add(button_1, gbc_button_1);
		
		button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "9");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 4;
		gbc_button_2.gridy = 7;
		panel.add(button_2, gbc_button_2);
		
		button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 0;
				number1 = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
			}
		});
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 7;
		gbc_button_14.gridy = 7;
		panel.add(button_14, gbc_button_14);
		
		button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "4");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 8;
		panel.add(button_3, gbc_button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "5");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 3;
		gbc_button_4.gridy = 8;
		panel.add(button_4, gbc_button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "6");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 4;
		gbc_button_5.gridy = 8;
		panel.add(button_5, gbc_button_5);
		
		button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
				number1 = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
			}
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 7;
		gbc_button_13.gridy = 8;
		panel.add(button_13, gbc_button_13);
		
		button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "1");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 9;
		panel.add(button_6, gbc_button_6);
		
		button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "2");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 3;
		gbc_button_7.gridy = 9;
		panel.add(button_7, gbc_button_7);
		
		button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "3");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 4;
		gbc_button_8.gridy = 9;
		panel.add(button_8, gbc_button_8);
		
		btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 2;
				number1 = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnX = new GridBagConstraints();
		gbc_btnX.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnX.insets = new Insets(0, 0, 5, 5);
		gbc_btnX.gridx = 7;
		gbc_btnX.gridy = 9;
		panel.add(btnX, gbc_btnX);
		
		button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + "0");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 10;
		panel.add(button_9, gbc_button_9);
		
		button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText(txtOutput.getText() + ".");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 3;
		gbc_button_10.gridy = 10;
		panel.add(button_10, gbc_button_10);
		
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
				
				// Special Functions
				if(operator == 4)result = Math.pow(number1, number2); 
				
				// Save the result to the output
				txtOutput.setText("" + result);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_11.gridwidth = 3;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 4;
		gbc_button_11.gridy = 10;
		panel.add(button_11, gbc_button_11);
		
		button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 3;
				number1 = Double.parseDouble(txtOutput.getText());
				txtOutput.setText("");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 7;
		gbc_button_12.gridy = 10;
		panel.add(button_12, gbc_button_12);
	}

}
