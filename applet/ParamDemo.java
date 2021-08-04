import java.applet.Applet;
import java.awt.Graphics;
/**
 * <applet code="ParamDemo" height="400" width="400">
 * <param name=msg value=jaymahismati>
 * <param name=font value=14>
 * </applet>
 */
public class ParamDemo extends Applet {
    String msg;
    int font;
    @Override
    public void start() {
        String str;
        msg=getParameter("msg");
        str=getParameter("font");
        try {
            if (str != null) {
                font=Integer.parseInt(str);
            } else {
                System.out.println("no");
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 200, 200);
        g.drawString(""+font, 200, 220);
        
    }
}