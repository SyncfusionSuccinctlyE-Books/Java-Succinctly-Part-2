		for(int i = 0; i < gameObjects.size(); i++) {
			GameObject o = gameObjects.get(i);
			o.update(timeTotal, timeDelta);

			// If this object is a bullet:
			if(o instanceof Bullet) {
				// Delete the bullet if it goes off the screen
				// to the right
				if(o.isOffScreenRight()) {
					gameObjects.remove(i);
					i--;
					continue;
				}
				
				// Check all baddies for collisions:
				for(int j = 100; j < gameObjects.size(); j++) {
					GameObject g = gameObjects.get(j);
					// If this is a baddie:
					if(g instanceof Baddie) {
						// If the baddie has hit the bullet:
						if(o.getDistance(g) < 14) {
							// Remove the baddie:
							gameObjects.remove(j);
							j--;
							i--;
						}
					}
				}
			}
			
			// If the object is a wall, or a baddie:
