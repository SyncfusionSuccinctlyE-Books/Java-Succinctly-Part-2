	private SpriteSheet sprites;

	private HPTimer hpTimer;

	// Constructor
	public Engine2D(int windowWidth, int windowHeight, int fps) {
		width = windowWidth;
		height = windowHeight;
		// Load the sprites
		sprites = new SpriteSheet("graphics/spaceracer.png", 16, 16);
		
		// Start the HPTimer
		hpTimer = new HPTimer();
		hpTimer.start();

		// Start the render/update loop
		Timer timer = new Timer(1000/fps, this);
		timer.start();
	}
