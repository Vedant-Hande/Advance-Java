import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="flowLayout.class" width =600 height=600></applet>*/

public class flowLayout extends Applet implements ActionListener {

     Button b;
     String msg;

     public void init() {
          FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 15, 15);

          setLayout(layout);
          add(b = new Button("One"));
          b.addActionListener(this);
          add(b = new Button("Two"));
          b.addActionListener(this);
          add(b = new Button("three"));
          b.addActionListener(this);
          add(b = new Button("four"));
          b.addActionListener(this);
          add(b = new Button("five"));
          b.addActionListener(this);
          add(b = new Button("six"));
          b.addActionListener(this);
          add(b = new Button("seven"));
          b.addActionListener(this);
     }

     public void actionPerformed(ActionEvent e) // getting action command
     {

          String s = e.getActionCommand();

          if (s.equals(s)) {
               msg = s + " clicked";
               repaint();
          }

     }

     public void paint(Graphics g) {
          g.drawString(msg, 100, 100);
     }

}