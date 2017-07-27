	public void run() {
		synchronized (counter) {
			for(int q = 0; q < 10000; q++) {

				counter.j++;
			}
		}
		running = false;	
	}
