public class Thready implements Runnable {

	// Private member variables:
	private Thread thread;
	private String name;

	// Constructor:
	public Thready(String name) {
		this.name = name;

		System.out.println("Created thread: " + name);
	}

	// Init and start thread method:
	public void initThread() {
		System.out.println("Initializing thread: " + name);

		thread = new Thread(this, name);

		thread.start();
	}

	// Overriden run method:
	public void run() {
		// Print initial message:
		System.out.println("Running thread: " + name);

		// Count to 10:
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread " + name + " counted " + i);

			try {
				// Wait for 1 second:
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
