	private void update(double timeTotal, double timeDelta) {
		// Generate new walls:
		if(timeTotal >= nextWallGenerationTime) {
// Add 0.5 second to the wall generation time
	nextWallGenerationTime += 0.5;

			for(int i = 0; i < 14; i++) {
				if(wallRNG.nextInt(3) == 0) {
					gameObjects.add(new Wall(320, i * 32));
				}
			}
		}

		// Generate new Baddies
		if(timeTotal >= nextBaddieGenerationTime) {
	// Death wave:
	//nextBaddieGenerationTime += baddieRNG.nextDouble() * 0.2 + 0.1;
	// Normal wave:
	nextBaddieGenerationTime += baddieRNG.nextDouble() * 4.0 + 0.5;

	gameObjects.add(new Baddie(320,baddieRNG.nextInt(280)-40));
		}

		for(int i = 0; i < gameObjects.size(); i++) {
			GameObject o = gameObjects.get(i);
			o.update(timeTotal, timeDelta);

			// If the object is a wall, or a baddie:
			if(o instanceof Wall || o instanceof Baddie) {
				if(o.isOffScreenLeft()) {
				// Delete if they go off the screen to the left
					gameObjects.remove(i);
					i--;
					continue;
				}
			}
		}
	}
