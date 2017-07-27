	private void update(double timeTotal, double timeDelta) {
		// Generate new walls:
		if(timeTotal >= nextWallGenerationTime) {
// Add 0.5 seconds to the wall generation time
			nextWallGenerationTime += 0.5; 
			for(int i = 0; i < 14; i++) {
				if(wallRNG.nextInt(3) == 0) {
					gameObjects.add(new Wall(640, i * 32));
				}
			}
		}

		for(int i = 0; i < gameObjects.size(); i++) {
			GameObject o = gameObjects.get(i);
			o.update(timeTotal, timeDelta);

			// If the object is a wall:
			if(o instanceof Wall) {
				if(o.isOffScreenLeft()) {
				// Delete as they go off the screen to the left
					gameObjects.remove(i);
					i--;
					continue;
				}
			}
		}
	}
