import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Engine2D extends JPanel implements ActionListener {
	// Width and height of the window
	private int width, height;
	
	private SpriteSheet sprites;

	private HPTimer hpTimer;
	
	// The GameObjects array list:
	ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

	// Wall variables
	double nextWallGenerationTime = 1.0;
	Random wallRNG = new Random();	// Any argument will
	// cause walls to be generated with the same pattern
	// every time!
	
	// Baddie variables
	double nextBaddieGenerationTime = 2.0;
	Random baddieRNG = new Random();
	
	// Player variables:
	Player player;
	boolean playerExploded = false;
	
	// Bullet variables
	double lastBulletTime = 0.0;
	double bulletCreationSpeed = 0.25;
	
	// Constructor
	public Engine2D(int windowWidth, int windowHeight, int fps) {
		width = windowWidth;
		height = windowHeight;
		
		// Load the sprites
		sprites = new SpriteSheet("graphics/spaceracer.png", 16, 16);
		
		// Create 100 stars
		for(int i = 0; i < 100; i++) {
			Star s = new Star();
			s.setAnimation(new Animation(Math.random() * 2 + 0.2, Math.random(), 5, 3, true)); 
			gameObjects.add(s);
			}
		
		// Create the player:
		player = new Player(16.0, 100.0);
		gameObjects.add(player);
		
		// Start the HPTimer
		hpTimer = new HPTimer();
		hpTimer.start();

		// Start the render/update loop
		Timer timer = new Timer(1000/fps, this);
		timer.start();
	}


	// This event is called when the timer fires at the specified fps
	public void actionPerformed(ActionEvent e) {
		// Read the most up-to-date time:
		hpTimer.update();
		
		// Pass HPTimer's times to our update method:
		update(hpTimer.timeTotal(), hpTimer.timeDelta());
		
		repaint();
	}

	
	// 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render((Graphics2D) g);
	}
	
	private void update(double timeTotal, double timeDelta) {
		// Generate new walls:
		if(timeTotal >= nextWallGenerationTime) {
			nextWallGenerationTime += 0.5;	// Add 0.5 second to the wall generation time

			for(int i = 0; i < 14; i++) {
				if(wallRNG.nextInt(3) == 0) {
					gameObjects.add(new Wall(320, i * 32));
				}
			}
		}

		// Generate new Baddies
		if(timeTotal >= nextBaddieGenerationTime) {
	// Death wave:
	//nextBaddieGenerationTime += baddieRNG.nextDouble() * 0.2 + 0.1;
			// Normal wave:
			nextBaddieGenerationTime += baddieRNG.nextDouble() * 4.0 + 0.5;

			gameObjects.add(new Baddie(320, baddieRNG.nextInt(280)-40));
		}

		for(int i = 0; i < gameObjects.size(); i++) {
			GameObject o = gameObjects.get(i);
			o.update(timeTotal, timeDelta);

			// If this object is a bullet:
			if(o instanceof Bullet) {
				// Delete the bullet if it goes off the screen
				// to the right
				if(o.isOffScreenRight()) {
					gameObjects.remove(i);
					i--;
					continue;
				}
				
				// Check all baddies for collisions:
				for(int j = 100; j < gameObjects.size(); j++) {
					GameObject g = gameObjects.get(j);
					// If this is a baddie:
					if(g instanceof Baddie) {
						// If the baddie has hit the bullet:
						if(o.getDistance(g) < 14) {
							// Remove the baddie:
							gameObjects.remove(j);
							j--;
							i--;
						}
					}
				}
			}
			
			// If the object is a wall, or a baddie:
			if(o instanceof Wall || o instanceof Baddie) {
				
				// Test if the wall/baddie has hit the player:
				if(o.getDistance(player) < 14 && !playerExploded) {
					player.setAnimation(new Animation(0.5, hpTimer.timeTotal(), 8, 4, false));
					playerExploded = true;
				}
				
				if(o.isOffScreenLeft()) {
					// Delete if they go off the screen to the left
					gameObjects.remove(i);
					i--;
					continue;
				}
			}
		}
	
		// Create bullets
		if(Keyboard.isKeyDown(32) &&
				hpTimer.timeTotal() - lastBulletTime >
				bulletCreationSpeed && !playerExploded) {
			gameObjects.add(new Bullet(player.x, player.y));
			lastBulletTime = hpTimer.timeTotal();
		}
	
		
		// When the explosion animation for the payer is finished, destroy all walls and baddies
		// and reset the player:
		if(playerExploded && player.getAnimation().getIsComplete()) {
			player.x = 16;
			player.y = 100;
			playerExploded = false;
			player.setAnimation(new Animation(0.1, 0.0, 0, 2, true));
			for(int i = 0; i < gameObjects.size(); i++) {
				if(gameObjects.get(i) instanceof Wall ||gameObjects.get(i) instanceof Baddie) { 
					gameObjects.remove(i); 
					i--;
				}
			}
		}
	}
	
	private void render(Graphics2D g) {
		// Clear the screen to blue
		g.setBackground(Color.DARK_GRAY);
		g.clearRect(0, 0, width, height);

		// Render the game objects:
		for(GameObject o: gameObjects)
			o.render(g, sprites);
	}
}
