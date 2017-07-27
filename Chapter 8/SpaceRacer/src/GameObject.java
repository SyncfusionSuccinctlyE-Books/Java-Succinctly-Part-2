import java.awt.Graphics2D;

public abstract class GameObject {
	// Position
	public double x, y;

	// Is the object visible?
	private boolean visible = true;
	
	// The object's animation
	private Animation animation = null;
	
	// Abstract Update and Render
	public void update(double timeTotal, double timeDelta) {
		if(animation != null)
			animation.update(timeTotal);
	}
	
	// Render the animation with the current frame if it exists and
	// is visible
	public void render(Graphics2D graphics, SpriteSheet sprites) {
		if(visible && animation != null) 
		sprites.render(graphics, animation.getCurrentFrame(),
				(int)x, (int)y);
	}

	// Getters and setters
	public double getX() {
	return x;
	}

	public double getY() {
	return y;
	}
	
	public boolean getVisible() {
		return visible;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public Animation getAnimation() {
		return animation;
	}
	
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
	
	// Location tests:
	// Test if the object is outside the screen to the left
	public boolean isOffScreenLeft() {
	return x < -16;
	}
	
	// Test if the object is outside the screen to the right
	public boolean isOffScreenRight() {
	return x >= 320;
	}

	// Test if the object is outside the screen at the top
	public boolean isOffScreenTop() {
	return y < -16;
	}

	// Test is the object is outside the screen at the bottom
	public boolean isOffScreenBottom() {
	return y >= 240;
	}
	
	// Compute the distance between the objects
	public double getDistance(GameObject o) {
		// Faster, but less accurate detection:
		// return Math.abs(o.x - x) + Math.abs(o.y - y); 
	
		// More accurate, but slow version:
		return Math.sqrt((o.x - x) * (o.x - x) + 
			(o.y - y) * (o.y - y)); 
	}
}
