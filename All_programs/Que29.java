import java.applet.Applet;
import java.awt.Graphics;

public class Que29 extends Applet {
   
    public void init() {
       
        String username = getParameter("username");
        
      
        System.out.println("Hello " + username);
    }
    
 
    public void paint(Graphics g) {
      
        g.drawString("Welcome to Greeting Applet", 20, 20);
    }
}
/*<applet code="GreetingApplet.class" width="300" height="200">
    <param name="username" value="John"> */