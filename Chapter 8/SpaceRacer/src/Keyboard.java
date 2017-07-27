import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
	// 256 key states: true means the key is down
	//					false means the key is up
	private boolean[] keyStates = null; 
	
	// The only instance of this class is the following
	// private, static instance:
	private static Keyboard staticInstance = null;
	
	// Private Constructor:
	private Keyboard() {
		keyStates = new boolean[256];
	}
	
	// Public init method which creates the
	// static key states if they do not exist
	public static void init() {
		staticInstance = new Keyboard();
		
		reset();
	}
	
	public static Keyboard getInstance() {
		return staticInstance;
	}
	
	// Set all key states to false
	public static void reset() {
		for(int i = 0; i < 256; i++)
			staticInstance.keyStates[i] = false;
	}
	
	// Test if a key is down
	public static boolean isKeyDown(int keyCode) {
		return staticInstance.keyStates[keyCode & 255];
	}
	
	// Set a key to down; true
	public void keyPressed(KeyEvent e) {
		staticInstance.keyStates[e.getKeyCode() & 255] = true;
	}

	// Set a key to up; false
	public void keyReleased(KeyEvent e) {
		staticInstance.keyStates[e.getKeyCode() & 255] = false;
	}

	// Extra, unused method from KeyListener interface
	public void keyTyped(KeyEvent e) { }
}