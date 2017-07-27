	// The GameObjects array list:
	ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

	// Constructor
	public Engine2D(int windowWidth, int windowHeight, int fps) {
		width = windowWidth;
		height = windowHeight;
		
		// Load the sprites
		sprites = new SpriteSheet("graphics/spaceracer.png", 32, 32);
		
		// Create 100 stars
		for(int i = 0; i < 100; i++) {
			Star s = new Star();
			s.setAnimation(new Animation(Math.random() * 2 + 0.2, Math.random(), 5, 3, true)); 
			gameObjects.add(s);
			}
