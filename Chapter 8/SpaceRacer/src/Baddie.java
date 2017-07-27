import java.awt.Graphics2D;
import java.util.Random;

public class Baddie extends GameObject {
	private double startY;
	
	private double frequency;
	private double amplitude;
	
	// Constructor
	public Baddie(double x, double y) {
		this.x = x;
		this.y = y;
		
		startY = y;
		
		// Create random frequency and amplitude
		Random r = new Random();
		frequency = r.nextDouble() * 2.0 + 2.0;
		amplitude = r.nextDouble() * 45 + 45;
	
		// Set the animation:
		this.setAnimation(new Animation(2));
	}
	
	// Move the baddie to the left
	public void update(double timeTotal, double timeDelta) {
		super.update(timeTotal, timeDelta);
		
		x -= 60 * timeDelta;
	
		y = startY + (Math.sin(timeTotal * frequency) * amplitude);
	}
}
