import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JComboBoxDemo" width=300 height=100>
</applet>
*/
public class JComboBoxDemo extends JApplet
implements ItemListener
{
JLabel jl;
ImageIcon green, red, black, yellow;
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
JComboBox jc = new JComboBox();
jc.addItem("Green");
jc.addItem("Red");
jc.addItem("Black");
jc.addItem("Yellow");
jc.addItemListener(this);
contentPane.add(jc);
jl = new JLabel(new ImageIcon("green.jpg"));
contentPane.add(jl);
}
public void itemStateChanged(ItemEvent ie)
{
String s = (String)ie.getItem();
jl.setIcon(new ImageIcon(s + "a.jpg"));
}
}