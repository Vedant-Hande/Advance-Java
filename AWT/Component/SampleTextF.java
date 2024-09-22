import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "SampleTextF"  width = 600 height=600></applet>*/

public class SampleTextF extends Applet implements ActionListener
{

 Button b1; String msg;
 TextField t1;
 
  public void init()
  {
        b1 = new Button("Click ME");
        b1.addActionListener(this);
        add(b1);
        msg ="Wait";
        t1 = new TextField(10); t1.setEchoChar('#');add(t1);
  }
  
 public void actionPerformed(ActionEvent ae)  
 { 
        String t;
        t = ae.getActionCommand();

 
       if(t.equals("Click ME") )
             {
                     t = t1.getText();
                     if(t.equals("fhfh") )
                          msg = "Correct";
                     else
                          msg="Wrong";
                     repaint();
              }
               

 }

 public void paint(Graphics g)
 {
         g.drawString(msg,200,200);
 }

}