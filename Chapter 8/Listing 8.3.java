	// Width and height of the window
	private int width, height;
	
	private SpriteSheet sprites;

	// Constructor
	public Engine2D(int windowWidth, int windowHeight, int fps) {
	width = windowWidth;
	height = windowHeight;

	// Load the sprites:
	sprites = new SpriteSheet("graphics/spaceracer.png", 16, 16);
	
	// Start the render/update loop
	Timer timer = new Timer(1000/fps, this);
	timer.start();
	}
