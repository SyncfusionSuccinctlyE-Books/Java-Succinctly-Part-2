	public void run() {
		for(int q = 0; q < 10000; q++) {
			synchronized (counter) {
				counter.j++;
			}
		}
	running = false;	
	}
