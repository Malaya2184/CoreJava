// This java applet program will show the bouncing balls



import java.applet.*;
import java.awt.*;
//<applet code="BouncingBall" height="400" Width="400"></applet>
public class BouncingBall extends Applet implements Runnable 
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// x,y coordinates and radius of the circle.
	int x = 150, y = 50;   
	int dx = 11, dy = 7;          
	
	// create thread.
	Thread t;
	boolean stopFlag;

	// Function to start thread.
	public void start() 
	{
		t = new Thread(this);
		t.start();
	}

	// Draw cicle from its present position.
	public void paint(Graphics g) 
	{
		g.setColor(Color.red);
		g.fillOval(x, y, 40, 40);
	}

	// function to move the image.
	public void run() 
	{
		while(true)
		{
			// Bounce if we've hit an edge.
			if ((x - 20 + dx < 0) || (x + 20 + dx > getBounds().width))
				dx = -dx;
			if ((y - 20 + dy < 0) || (y + 20 + dy > getBounds().height)) dy = -dy;
			// Move the circle.
			x += dx;  y += dy;

			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println(e);
			};
			// print circle again n again.
			repaint();
		}
	}
}
