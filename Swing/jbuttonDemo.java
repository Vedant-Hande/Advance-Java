
import java.awt.*;
import javax.swing.*; 
import java.applet.*;
import java.awt.event.*;

/*<applet code="jbuttonDemo" width=200 height=200></applet>*/

public class jbuttonDemo extends JApplet implements ActionListener
{ 	
   JTextField jf;
    public void init()
    {
       	Container contentpane=getContentPane();
       	contentpane.setLayout(new FlowLayout());
       	ImageIcon i=new ImageIcon("a.gif");
       	JButton jb=new JButton(i);
	jb.setActionCommand("button1");
	jb.addActionListener(this);
	contentpane.add(jb);

       
	jf=new JTextField(10);

       
       	contentpane.add(jf);
      	
    }
public void actionPerformed(ActionEvent ae)
	{
	    jf.setText(ae.getActionCommand());
        }
}