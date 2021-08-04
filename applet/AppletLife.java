import java.applet.Applet;
import java.awt.Graphics;
//<applet code="AppletLife" height="400" width="400"></applet>

public class AppletLife extends Applet {
    int count=1;
    @Override
    public void init() {
        System.out.println("init() method is called "+" "+ count++);
    }
    @Override
    public void start() {
        System.out.println("strat() method is called "+" "+ count++);
    }
    @Override
    public void stop() {
        System.out.println("stop() method is called "+" "+ count++);
    }
    @Override
    public void destroy() {
        System.out.println("destroy() method is called "+" "+ count++);
    }
    @Override
    public void paint(Graphics g) {
        System.out.println("paint() method is called "+" "+ count++);
        g.drawString("jay mahismati", 100, 100);
    }

}