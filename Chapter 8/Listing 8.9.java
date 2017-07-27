	// Temporary test, delete this line after making
	// sure the program animates:
	static double x = 0;
	
	private void render(Graphics2D g) {
		// Clear the screen to blue
		g.setBackground(Color.DARK_GRAY);
		g.clearRect(0, 0, width, height);

		// Temporary test:
		sprites.render(g, (int)x % 2, (int)x, 0);
		x+=hpTimer.timeDelta();
	}
