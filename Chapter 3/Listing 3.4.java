// Abstract parent class:
public abstract class GameObject {
	// Member variables:
	int x, y;
	
	// Non-abstract method:
	public void print() {
		System.out.println("Position: " + x + ", " + y);
	}
	
	// Abstract method:
	public abstract void move();
}
