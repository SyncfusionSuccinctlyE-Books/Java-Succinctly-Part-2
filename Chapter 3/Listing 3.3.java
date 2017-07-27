public class MainClass {
	public static void main(String[] args) {
		// Create 5 objects in our game
		GameObject[] gameObjects = new GameObject[5];

		// First object is the player
		gameObjects[0] = new Player();

		// OPtehr objects are NPC's
		for(int i = 1; i < 5; i++) {
			gameObjects[i] = new NPC();
		}

		// Call move for all objects in the game
		for(int i = 0; i < 5; i++) {
			gameObjects[i].move();
		}
	}
}
