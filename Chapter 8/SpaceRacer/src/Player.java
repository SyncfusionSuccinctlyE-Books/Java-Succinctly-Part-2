public class Player extends GameObject {
	double shipSpeed = 320.0;
	
	public Player(double x, double y) {
		// Set the x/y
		this.x = x; this.y = y;
		
		// Set the animation
		this.setAnimation(new Animation(0.1, 0.0, 0, 2, true));
	}
	
	public void update(double timeTotal, double timeDelta) {
		// Call parent's update:
		super.update(timeTotal, timeDelta);
		
		//Up/Down
		if(Keyboard.isKeyDown(40)) y += shipSpeed * timeDelta;
		if(Keyboard.isKeyDown(38)) y -= shipSpeed * timeDelta;
	
		// Left/Right
		if(Keyboard.isKeyDown(37)) x -= shipSpeed * timeDelta;
		if(Keyboard.isKeyDown(39)) x += shipSpeed * timeDelta;
	
		// Make sure the player is on the screen:
		if(x < 0) x = 0;
		if(y < 0) y = 0;
		if(x > 320 - 32.0) x = 320 - 32.0;
		if(y > 240 - 32.0) y = 240 - 32.0;
	}
}
