import java.awt.*;
import java.applet.*;

/*<applet code="fl.class" width=800 height=800>
</applet> */

public class fl extends Applet
{
  Button button1,button2,button3;

 public void init()
 {
     FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 10);

     setLayout(layout);

button1 = new Button("Button1");

button2 = new Button("Button2");

button3 = new Button("Button3");

add(button1);

add(button2);

add(button3);

 }
 
 
 public void paint(Graphics g)
 {

 }


}