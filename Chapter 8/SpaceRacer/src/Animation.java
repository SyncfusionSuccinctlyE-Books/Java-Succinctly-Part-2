public class Animation {
	private double speed, startTime;
	private int firstFrame, frameCount;
	private int currentFrame;
	private boolean isComplete = false;
	private boolean looping;
	
	// Constructor for looping/multiframe animation
	public Animation(double speed, double startTime, int firstFrame,
			int frameCount, boolean looping) {
		this.speed = speed;
		this.startTime = startTime;
		this.firstFrame = firstFrame;
		this.frameCount = frameCount;
	
		// Reset
		currentFrame = firstFrame;
		isComplete = false;
		this.looping = looping;
	}
	
	// Constructor for single frame animation
	public Animation(int frame) {
		speed = 1.0;
		startTime = 0.0;
		firstFrame = frame;
		frameCount = 1;
		// Reset
		currentFrame = firstFrame;
		isComplete = false;
		this.looping = true;
	}
	
	// Compute the current frame and the
	// isComplete boolean
	public void update(double timeTotal) {
		double elapsedTime = timeTotal - startTime;
		currentFrame = (int)(elapsedTime / speed);
		
		if(currentFrame < 0) currentFrame = 0;
		
		// If the frame is past the end of the animation,
		// set it to the last frame
		if(currentFrame >= frameCount) {
			// If the animation does not loop, set it to the final
			// frame indefinitely
			if(!looping)
				currentFrame = firstFrame + frameCount - 1;
			// If the animation is looping,
			// set it back to the first frame
			else {
				currentFrame = firstFrame;
				startTime = timeTotal;
			}
			
			isComplete = true;
		}
		
		// Otherwise, the current frame is the first frame +
		// however many frames we've played so far:
		else
			currentFrame += firstFrame;
	}
	
	// Returns the current frame
	public int getCurrentFrame() {
		return currentFrame;
	}
	
	// Determines if the animation has played all frames
	public boolean getIsComplete() {
		return isComplete;
	}
}
