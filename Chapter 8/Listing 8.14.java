	private void update(double timeTotal, double timeDelta) {
		// Update the game objects:
		for(GameObject o: gameObjects)
			o.update(timeTotal, timeDelta);
	}
	
	private void render(Graphics2D g) {
		// Clear the screen to blue
		g.setBackground(Color.DARK_GRAY);
		g.clearRect(0, 0, width, height);

		// Render the game objects:
		for(GameObject o: gameObjects)
			o.render(g, sprites);
	}
