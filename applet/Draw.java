import java.applet.Applet;
import java.awt.*;
//<applet code="Draw" height="400" width="400"></applet>
public class Draw extends Applet{
    @Override
    public void init() {
        setBackground(Color.LIGHT_GRAY);
    }
@Override
public void paint(Graphics g) {
    g.setColor(Color.GREEN);
    g.drawLine(10, 50, 200, 50);
    g.drawRect(20, 60, 100, 50);
    g.fillRect(50, 80, 30, 70);
    g.fillRoundRect(120, 160, 100, 100, 80, 50);
    g.fillArc(250,10,100,100,0,90);
    g.setColor(Color.RED);
    g.drawString("iterator", 200, 200);
    
}
}