import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
//<applet code="Smily" height="400" width="400"></applet>
public class Smily extends Applet {
    @Override
    public void init() {
        setBackground(Color.RED);
    }
@Override
public void paint(Graphics g) {
    g.setColor(Color.YELLOW);
    g.fillOval(100, 100, 230, 230);
    g.setColor(Color.DARK_GRAY);
    g.fillOval(150, 150, 40, 40);
    g.setColor(Color.DARK_GRAY);
    g.fillOval(240, 150, 40, 40);
    g.setColor(Color.DARK_GRAY);
    g.fillRect(180, 260, 70, 40);
}
}