
import java.awt.*;
import javax.swing.*; 
import java.applet.*;

/*<applet code="textFieldDemo" width=200 height=200></applet>*/

public class textFieldDemo extends JApplet
{ 	
   JTextField j;
    public void init()
    {
       Container contentpane=getContentPane();
       
	
       
        j=new JTextField(15);

       
        contentpane.add(j);
      	
    }
}