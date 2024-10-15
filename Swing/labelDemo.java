
import java.awt.*;
import javax.swing.*;
import java.applet.*;


/*<applet code="labelDemo" width=200 height=200></applet>*/

public class labelDemo extends JApplet
{ 	
    public void init()
    {
       Container contentpane=getContentPane();
       
       ImageIcon i=new ImageIcon("a.jpg");

       JLabel l1=new JLabel("abc",i,JLabel.CENTER);
       contentpane.add(l1);
      	
    }	
    }
