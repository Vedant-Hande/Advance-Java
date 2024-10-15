import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Jcombo extends JApplet implements ItemListener
{
Container c;
JComboBox j;
JLabel jl;
 JTextField jf;
public void init()
{
c=getContentPane();
c.setLayout(new FlowLayout());
j=new JComboBox();
j.addItem("asdsd");
j.addItem("baaa");
j.addItem("cnmkl");
j.addItem("dvcbd");
j.addItem("eedsw");
j.addItem("fnmkj");
j.addItem("alopi");
j.addItem("bjhkl");
j.addItem("cbgty");
j.addItem("dcvbd");
j.addItem("ecsdf");
j.addItem("fkloi");

c.add(j);

jf=new JTextField(10);
c.add(jf);
j.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{ 
   
  jf.setText("Selected item "+ ie.getItem());
 
}
}


/*<applet code="Jcombo" width=400 height=700>
</applet>*/
