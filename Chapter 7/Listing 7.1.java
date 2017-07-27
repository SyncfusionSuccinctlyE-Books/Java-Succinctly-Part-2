	private JButton btnF_15;
	private JButton btnF_16;
	private JButton btnF_17;

	// State variables
	private int state = 0;		// 0 to for first number, 1 for second
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
