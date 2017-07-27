// MainClass.java
public class MainClass {
	public static void main(String[] args) {
		// Define some threads:
		Thready thread0 = new Thready(0);
		Thready thread1 = new Thready(1);
		// set the value to factor:
		Thready.x = 36847153;
		// Start the threads:
		thread0.start();
		thread1.start();
		
		// Wait for the threads to finish
		while(thread0.isAlive()) { }
		while(thread1.isAlive()) { }
		// Print out the factors the threads found:
		System.out.println(
				"Smallest Factor found by thread0: " + thread0.smallestFactor);
		System.out.println(
				"Smallest Factor found by thread1: " + thread1.smallestFactor);
	}
}
