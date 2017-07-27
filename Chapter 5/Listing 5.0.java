public class MainClass {
	public static void main(String[] args) {
		// Define Thready objects:
		Thready t1 = new Thready("Ned");
		Thready t2 = new Thready("Kelly");

		// Start the threads:
		t1.initThread();
		t2.initThread();
	}
}
