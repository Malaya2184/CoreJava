// Java program to draw polygon using 
// drawPolygon(int[] x, int[] y, int numberofpoints) 
// function 
import java.awt.*; 
import javax.swing.*; 
//<applet code="Poly" height="400" width="400"></applet>
public class Poly extends JApplet { 
  
    // called when applet is started 
    public void init() 
    { 
        // set the size of applet to 300, 300 
        setSize(400, 400); 
        show(); 
    } 
  
    // invoked when applet is started 
    public void start() 
    { 
    } 
  
    // invoked when applet is closed 
    public void stop() 
    { 
    } 
  
    public void paint(Graphics g) 
    { 
        // x coordinates of vertices 
        int x[] = { 10, 50, 80, 90, 110, 140 }; 
  
        // y coordinates of vertices 
        int y[] = { 20, 10, 50, 40, 30, 80 }; 
  
        // number of vertices 
        int numberofpoints = 6; 
  
        // set the color of line drawn to blue 
        g.setColor(Color.blue); 
  
        // draw the polygon using drawPolygon function 
        g.drawPolygon(x, y, numberofpoints); 
    } 
}