public class Thready implements Runnable {

	// A shared resource:
	public class Counter {
		private int j;
		
		public Counter() {
			j = 0;
		}
		
		public int getJ() {
			return j;
		}
	}

	// Thready member variables
	private Thread thread;
	private String name;
	private boolean running = true;
	
	// Static shared resource:
	private static Counter counter = null;

	// Getters:
	public static int getJ() {
		return counter.getJ();
	}
	
	public boolean isRunning() {
		return running;
	}

	// Constructor
	public Thready(String name) {
		// Create the shared resource
		if(counter == null)
			counter = new Counter();

		// Assign name
		this.name = name;

		// Print message
		System.out.println("Created thread: " + name);
	}

	public void initThread() {
		// Print message
		System.out.println("Initializing thread: " + name);

		// Create thread
		thread = new Thread(this, name);

		// Call run
		thread.start();
	}

	public void run() {
		for(int q = 0; q < 10000; q++) {
				counter.j++;	// RACE CONDITION!!!
		}

		running = false;	
	}
}
