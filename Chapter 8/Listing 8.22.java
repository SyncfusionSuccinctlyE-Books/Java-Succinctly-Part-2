	private MainClass(int windowWidth, int windowHeight) {
		setSize(windowWidth, windowHeight); // Set window size
		setLocationRelativeTo(null); // Default location
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
		setVisible(true);
		
		// Init the static singleton keyboard: 
		Keyboard.init();
		
		// Add a keylistener
		addKeyListener(Keyboard.getInstance());

		
		// Create and add the engine JPanel:
		final Engine2D engine = new Engine2D(windowWidth, windowHeight, 30);
		add(engine);
	}
