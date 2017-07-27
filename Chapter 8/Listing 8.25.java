	private void update(double timeTotal, double timeDelta) {
		// Generate new walls:
		if(timeTotal >= nextWallGenerationTime) {
			nextWallGenerationTime += 0.5;// Add 0.5 second to the wall generation time

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

			gameObjects.add(new Baddie(320, baddieRNG.nextInt(280)-40));
		}

		for(int i = 0; i < gameObjects.size(); i++) {
			GameObject o = gameObjects.get(i);
			o.update(timeTotal, timeDelta);

			// If the object is a wall, or a baddie:
			if(o instanceof Wall || o instanceof Baddie) {
				
				// Test if the wall/baddie has hit the player:
				if(o.getDistance(player) < 14 && !playerExploded) {
					player.setAnimation(new Animation(0.5, hpTimer.timeTotal(), 8, 4, false));
					playerExploded = true;
				}
				
				if(o.isOffScreenLeft()) {
					// Delete if they go off the screen to the left
					gameObjects.remove(i);
					i--;
					continue;
				}
			}
		}
	
	
		// When the explosion animation for the payer is finished, destroy all walls and baddies
		// and reset the player:
		if(playerExploded && player.getAnimation().getIsComplete()) {
			player.x = 16;
			player.y = 100;
			playerExploded = false;
			player.setAnimation(new Animation(0.1, 0.0, 0, 2, true));
			for(int i = 0; i < gameObjects.size(); i++) {
				if(gameObjects.get(i) instanceof Wall ||gameObjects.get(i) instanceof Baddie) { 
					gameObjects.remove(i); 
					i--;
				}
			}
		}
	}
