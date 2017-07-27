import java.awt.Graphics2D;

public class Wall extends GameObject {
	public Wall(double x, double y) {
		this.x = x;
		this.y = y;

		this.setAnimation(new Animation(4));
	}
	
	// Move the wall to the left
	public void update(double timeTotal, double timeDelta) {
		super.update(timeTotal, timeDelta);
		
		x -= 80 * timeDelta;
	}
	
	// Determines if the ships has collided with this wall
	public boolean collisionWithShip(double shipX, double shipY) {
		double dist = Math.abs(x - shipX) + Math.abs(y - shipY);
				
		return dist < 10;
	}
}
