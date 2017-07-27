public class MainClass {
	public static void main(String[] args) {
		// Define some object:
		GameObject someObject = new Player();

		// Test if the first object is a GameObject?
		if(someObject instanceof GameObject) 
			System.out.println("Object is a GameObject!");
		else
			System.out.println("Not a GameObject...");

		// Test if it is a Player?
		if(someObject instanceof Player) 
			System.out.println("Object is a Player!");
		else
			System.out.println("Not a Player...");


		// Test if it is an NPC?
		if(someObject instanceof NPC) 
			System.out.println("Object is a NPC!");
		else
			System.out.println("Not an NPC...");
	}
}
