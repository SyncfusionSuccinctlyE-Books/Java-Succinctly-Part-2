		// Create bullets
		if(Keyboard.isKeyDown(32) &&
				hpTimer.timeTotal() - lastBulletTime >
				bulletCreationSpeed && !playerExploded) {
			gameObjects.add(new Bullet(player.x, player.y));
			lastBulletTime = hpTimer.timeTotal();
		}
	
// When the explosion animation for the payer is finished, destroy all walls and baddies
