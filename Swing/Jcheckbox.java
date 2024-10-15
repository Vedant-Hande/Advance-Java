import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="Jcheckbox" width=400 height=50>
</applet>
*/
public class Jcheckbox extends JApplet
implements ItemListener
{
JTextField jtf;
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
JCheckBox cb = new JCheckBox("C", true);
cb.addItemListener(this);
contentPane.add(cb);
cb = new JCheckBox("C++", false);
cb.addItemListener(this);
contentPane.add(cb);
cb = new JCheckBox("Java", false);
cb.addItemListener(this);
contentPane.add(cb);
cb = new JCheckBox("Perl", false);
cb.addItemListener(this);
contentPane.add(cb);
jtf = new JTextField(15);
contentPane.add(jtf);
}
public void itemStateChanged(ItemEvent ie)
{
JCheckBox cb = (JCheckBox)ie.getItem();
jtf.setText(cb.getText());
}
}