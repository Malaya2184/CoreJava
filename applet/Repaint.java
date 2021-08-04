import java.applet.Applet;
import java.awt.Graphics;
//<applet code="Repaint" height="400" width="400"></applet>
public class Repaint extends Applet {
    int i=1;
    @Override
    public void paint(Graphics g) {
        g.drawString("i ="+i, 200, 200);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("exception");
            //TODO: handle exception
        }
        i++;
        showStatus("kashaww");
        repaint();

    }
}