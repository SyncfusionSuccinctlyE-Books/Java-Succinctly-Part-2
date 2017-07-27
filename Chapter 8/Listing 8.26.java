import java.awt.Graphics2D;

public class Bullet extends GameObject {

	// Constructor
	public Bullet(double x, double y) {
		this.x = x;
		this.y = y;
	
		// Set the animation
		this.setAnimation(new Animation(3));
	}
	
	// Move the bullet to the right
	public void update(double timeTotal, double timeDelta) {
		super.update(timeTotal, timeDelta);
		
		x += 800 * timeDelta;
	}
}
