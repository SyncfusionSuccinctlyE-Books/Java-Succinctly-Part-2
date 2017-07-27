	// The GameObjects array list:
	ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

	// Wall variables
	double nextWallGenerationTime = 1.0;
	Random wallRNG = new Random();	// Any argument will
	// cause walls to be generated with the same pattern
	// every time!
	
	// Constructor
	public Engine2D(int windowWidth, int windowHeight, int fps) {
