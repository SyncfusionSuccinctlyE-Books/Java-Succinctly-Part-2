import java.awt.Graphics2D;

public class Star extends GameObject {
	double speed;

	public Star() {
		// Begin the stars in a random location:
		x = Math.random() * 320.0;
		y = Math.random() * 240.0;
		
		// Set the stars to a random speed:
		speed = Math.random() * 30.0 + 30;
	}

	public void update(double timeTotal, double timeDelta) {
		// Call the parent update
		super.update(timeTotal, timeDelta);
		
		// Move the star left
		x -= speed * timeDelta; 
	
		// Reset the star on the right when it goes off screen
		if(isOffScreenLeft()) {
			x = 320.0; // Just outside the right-hand edge
			y = Math.random() * 240.0 - 16; // Random Y location
		}
	}
}
