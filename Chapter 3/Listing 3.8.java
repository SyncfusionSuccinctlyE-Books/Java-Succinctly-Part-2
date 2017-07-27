public class Player extends GameObject {
	
	// Constructor
	public Player() {
		x = y = 100;	// Start the player at 100x100
	}
	
	public void move() {
		System.out.println("It is the player's move...");
		// Poll the keyboard or read the mouse movements etc.
	}
	
	@Override
	public void print() {
		System.out.println("Player position: " + x + ", " + y);
	}
}
