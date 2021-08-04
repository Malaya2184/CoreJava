import java.applet.*;
import java.awt.*;
//<applet code="Bounce" height="500" width="500" ></applet>

public class Bounce extends Applet implements Runnable {

    int x,y,dx,dy;
    public Bounce()
    {
        x=100;
        y=200;
        dx=2;
        dy=5;
        Thread T=new Thread(this);
        T.start();
    }
    @Override
    public void init() {
        setBackground(Color.BLACK);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 20, 20);
    }
    
    @Override
    public void run() {
        
        while (true) {
            x+=dx;
            y+=dy;
            if (x <= 0 || x >= getBounds().width)
				dx = -dx;
            if (y <= 0 || y >= getBounds().height) 
                dy = -dy;
            
            repaint();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("exception");//TODO: handle exception
            }
            
        }
    }
}