	// Temporary test, delete this line after making
	// sure the program animates:
	static int x = 0;
	
	private void render(Graphics2D g) {
		// Clear the screen to blue
		g.setBackground(Color.DARK_GRAY);
		g.clearRect(0, 0, width, height);

		// Temporary test:
		sprites.render(g, x % 2, x, 0);
		x++;
	}
