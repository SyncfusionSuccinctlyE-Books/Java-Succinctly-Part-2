// The class Extends the Thread class 
public class Thready extends Thread {
	// Shared resource
	public static int x;
	public int id;
	// Smallest factor found by this thread:
	public int smallestFactor = -1;
	
	// Constructor
	public Thready(int id) {
		this.id = id;
	}
	
	// run method
	public void run() {
		// Figure out the root:
		int rootOfX = (int)Math.sqrt(x) + 1;
	
		// Figure out the start and finish points:
		int start = (rootOfX / 2) * id;
		int finish = start + (rootOfX / 2);
		
		// If the number is even:
		if(x % 2 == 0) {
			smallestFactor = 2;
			return;
		}		
		// Don't check 0 and 1 as a factor:
		if(start == 0 || start == 1)
			start = 3;
		
		// Only check odd numbers:
		if(start % 2 == 0)
			start++;
		
		// Try to find a factor
		for(int i = start; i < finish; i+=2) {
			if(x % i == 0) {
				smallestFactor = i;
				break;
			}
		}
	}
}
