import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="flowLayout.class" width =600 height=600></applet>*/

public class flowLayout extends Applet implements ActionListener {

    Button b;String msg;

    public void init () 
   {    FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 10);

        setLayout(layout);
        add (b = new Button ("One"));
        b.addActionListener (this);
        add (b = new Button ("Two"));
        b.addActionListener (this);
        add (b = new Button ("three"));
        add (b = new Button ("four"));
add (b = new Button ("five"));
add (b = new Button ("six"));
add (b = new Button ("seven"));
add (b = new Button ("One"));
add (b = new Button ("One"));
add (b = new Button ("One"));
add (b = new Button ("One"));
    }

    public void actionPerformed (ActionEvent e)   //getting action command
   {

        String s = e.getActionCommand();
        

        if ("One".equals(s)) {  msg = "one clicked"; repaint(); }
        if ("Two".equals(s)) {  msg = "two clicked";repaint(); }
    }

   public void paint(Graphics g)
  {
       g.drawString(msg,100,100);
  }

}

// Other Useful Methods

// hide , show , setBounds, setFont, setBackground, setForeGround, setSize, getActioncommand, 


 