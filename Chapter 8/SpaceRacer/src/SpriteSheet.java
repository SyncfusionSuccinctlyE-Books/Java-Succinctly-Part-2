import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheet {
	
	private BufferedImage bmp; // The loaded image
	private int spritesAcross = -1;// Number of sprites across the image
	private int totalSprites; // Total sprites in the image
	private int spriteWidth, spriteHeight;// width/height of each sprite

	// Constructor
	public SpriteSheet(String filename,int spriteWidth,int spriteHeight) {
		// Load the bitmap
		try {
			bmp = ImageIO.read(new File(filename));
		}
		catch(IOException e) {
			// File not found
			spritesAcross = -1;
			return;
		}
		// Save the sprite width and height
		this.spriteWidth = spriteWidth;
		this.spriteHeight = spriteHeight;
		// spritesAcross is used to compute the
		// source rectangles when rendering
		spritesAcross = bmp.getWidth() / this.spriteWidth;
		// totalSprites is used to ensure we're not
		// trying to render sprites which do not exist
		totalSprites = spritesAcross * (bmp.getHeight() / spriteHeight);
	}

	// This method can be used to test if the sprites loaded
	public Boolean isValid() {
		return spritesAcross != -1;
	}
	
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

}
