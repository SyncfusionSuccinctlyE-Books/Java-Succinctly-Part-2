public class MainClass {
	public static void main(String[] args) {
		// Create three threads:
		Thready t1 = new Thready("Ned");
		Thready t2 = new Thready("Kelly");
		Thready t3 = new Thready("Pole");
		
		// init and run the threads
		t1.initThread();
		t2.initThread();
		t3.initThread();
		
		// Wait for the threads to finish:
		while(t1.isRunning()) {
		}

		while(t2.isRunning()) {
		}

		while(t3.isRunning()) {
		}

		// Check what the counter is:
		System.out.println("All done!" + Thready.getJ());`
	}
}
