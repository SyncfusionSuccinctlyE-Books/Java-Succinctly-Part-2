// Abstract parent class:
public abstract class GameObject {
	// Member variables:
	int x, y;
	
	// Constructor
	public GameObject() {
		// Set the x and y:
		x = y = -1;
	}
	
	// Non-abstract method:
	public void print() {
		System.out.println("Position: " + x + ", " + y);
	}
	
	// Abstract method:
	public abstract void move();
}
