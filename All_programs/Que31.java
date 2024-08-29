import java.applet.*;
import java.awt.*;

public class Que31 extends Applet {
    
    public void paint(Graphics g) {
    
        g.setColor(Color.red);
      
        g.fillRect(20, 20, 100, 50);
        
     
        g.setColor(Color.blue);
     
        g.fillOval(150, 20, 100, 50);
        
      
        g.setColor(Color.green);
  
        g.drawLine(20, 100, 250, 100);
    }
}
/*<applet code="Que31.class" width="300" height="150"> */
