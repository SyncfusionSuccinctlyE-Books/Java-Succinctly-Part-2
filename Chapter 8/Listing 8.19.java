	// Wall variables
	double nextWallGenerationTime = 1.0;
	Random wallRNG = new Random();	// Any argument will
	// cause walls to be generated with the same pattern
	// every time!
	
	// Baddie variables
	double nextBaddieGenerationTime = 2.0;
	Random baddieRNG = new Random();
	
	// Constructor
	public Engine2D(int windowWidth, int windowHeight, int fps) {
