import java.awt.*;
import java.applet.*;

/*<applet code="gl.class" width=800 height=800>
</applet> */

public class gl extends Applet
{
  Button button1,button2,button3,button4;

 public void init()
 {
     GridLayout layout =

    new GridLayout(2, 2, 0, 0);

setLayout(layout);

button1 = new Button("Button1");

button2 = new Button("Button2");

button3 = new Button("Button3");

button4 = new Button("Button4");

add(button1);

add(button2);

add(button3);

add(button4);


 }
 
 
 public void paint(Graphics g)
 {

 }


}