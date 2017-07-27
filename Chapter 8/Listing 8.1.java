import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Engine2D extends JPanel implements ActionListener {
	// Width and height of the window
	private int width, height;
	
	// Constructor
	public Engine2D(int windowWidth, int windowHeight, int fps) {
		width = windowWidth;
		height = windowHeight;
		Timer timer = new Timer(1000/fps, this);
		timer.start();
	}

	// This event is called when the timer fires at the specified fps
	public void actionPerformed(ActionEvent e) {
		update(0.0, 0.0);
		repaint();
	}
	
	// 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render((Graphics2D) g);
	}
	
	private void update(double timeTotal, double timeDelta) {
	}
	
	private void render(Graphics2D g) {
		// Clear the screen to blue
		g.setBackground(Color.DARK_GRAY);
		g.clearRect(0, 0, width, height);
	}
}
