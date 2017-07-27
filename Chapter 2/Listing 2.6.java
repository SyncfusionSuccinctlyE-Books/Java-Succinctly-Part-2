import java.io.Serializable;

public class Animal implements Serializable {
	// Member variables
	float height;
	String name;
	boolean extinct;
	
	// Constructor
	public Animal(String name, float height, boolean extinct) {
		this.name = name;
		this.height = height;
		this.extinct = extinct;
	}

	// Output method
	public void print() {
		System.out.println("Name: " + name + "\n" +
			"Height: " + height + "\n" +
			"Extinct: " + extinct + "\n");
	}
}
