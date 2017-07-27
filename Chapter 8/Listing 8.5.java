	public void render(Graphics2D g, int spriteIndex, int x, int y) {
		// Make sure the sprite is actually on our spriteSheet
		if(spriteIndex >= totalSprites) return;
		// Compute the source x and y
		int srcX = (spriteIndex % spritesAcross) * spriteWidth;
		int srcY = (spriteIndex / spritesAcross) * spriteHeight;
		// Draw the image
		g.drawImage(bmp,
		x*2, // Destination x1
		y*2, // Destination y1
		(x + spriteWidth)*2, // Destination x2
		(y + spriteHeight)*2, // Destination y2 
		srcX, // Source x1
		srcY, // Source y1
		srcX + spriteWidth, // Source x2
		srcY + spriteHeight,// Source y2
		null); // Observer
		}
