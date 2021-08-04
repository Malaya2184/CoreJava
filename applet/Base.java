import java.applet.Applet;
import java.awt.Graphics;
import java.net.URL;
//<applet code="Base" height="500" width="500"></applet>

public class Base extends Applet {
    @Override
    public void paint(Graphics g) {
        String msg;
        URL url;
        url=getCodeBase();
        msg="code base:-"+url.toString();
        g.drawString(msg, 50, 50);
        url=getDocumentBase();
        msg="document base:-"+url.toString();
        g.drawString(msg, 50, 70);
    }

}