// A Hello World Applet 
// Save file as HelloWorld.java 
  
import java.applet.*; 
import java.awt.*; 
//<applet code="HelloWorld" width=400 height=400></applet>
// HelloWorld class extends Applet 
public class HelloWorld extends Applet  
{ 
    /**
     *
     */
    ;

    // Overriding paint() method
    @Override
    public void paint(Graphics g)  
    { 
        g.drawString("Jay Mahismati", 100, 100); 
    } 
      
}