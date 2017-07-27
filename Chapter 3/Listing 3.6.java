public class Player extends GameObject {
	public void move() {
		System.out.println("It is the player's move...");
		// Poll the keyboard or read the mouse movements etc.
	}
	
	@Override
	public void print() {
		System.out.println("Player position: " + x + ", " + y);
	}
}
