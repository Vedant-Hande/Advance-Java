import java.applet.*;
import java.awt.*;


public class Que30 extends Applet {
   
    public void init() {
        
        setBackground(Color.yellow);
        
        setForeground(Color.blue);
    }
    

    public void paint(Graphics g) {
        
        g.drawString("Welcome to the world of applet", 20, 20);
    }
}
/*<applet code="Que30.class" width="300" height="200">*/