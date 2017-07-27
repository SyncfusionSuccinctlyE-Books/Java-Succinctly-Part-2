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
}
