
public class HPTimer {
	// Member variables
	long startTime, lastTime, currentTime;

	// Set the start, last and current times to now:
	public void reset() {
		startTime = System.currentTimeMillis();

		// You can also use nano time:
		//startTime = System.nanoTime();

		lastTime = startTime;
		currentTime = startTime;
	}

	// Reset teh timer
	public void start() {
		reset();
	}

	// Record the current time
	public void update() {
		lastTime = currentTime;
		currentTime = System.currentTimeMillis();

		// If using nano time:
		//currentTime = System.nanoTime();
	}

	// Return the time since the last call to update
	public double timeDelta() {
		double d = (double) currentTime - (double) lastTime;
		d /= 1000.0;	

		// If using nano time:
		// d /= 1000000000.0;
		return d;
	}

	// Return the time since the last call to reset
	public double timeTotal() {
		double d = (double) currentTime - (double) startTime;
		d /= 1000.0;

		// If using nano time:
		//d /= 1000000000.0;
		return d;
	}
}
