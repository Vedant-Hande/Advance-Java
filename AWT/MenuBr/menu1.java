/*
Develop a program to create three  Menus- ‘File’, ‘Edit’ and ‘Format’. 
Disable the ‘Format’ Menu.  
*/

/*
<Applet code=menu1 width=500 height=500>
</Applet>
*/

import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.MenuBar;
import java.awt.Frame;
import java.applet.Applet;
import java.awt.Dimension;

public class menu1 extends Applet
{
	Dimension d1=new Dimension(300,300);
	public void init()
	{
	Frame f1=new DisabledFormat2("MY FRAME");
	f1.setSize(d1);
	f1.setVisible(true);
	}

}

class DisabledFormat2 extends Frame
{
	MenuBar mb1;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9;
	
	public DisabledFormat2(String s1)
	{
	mb1=new MenuBar();
	m1=new Menu("File");
	m2=new Menu("Edit");
	m3=new Menu("Format");
	m3.setEnabled(false);

	mi1=new MenuItem("Open");
	mi2=new MenuItem("Save");
	mi3=new MenuItem("Save as");
	m1.add(mi1);
	m1.add(mi2);
	m1.add(mi3);

	mi4=new MenuItem("Undo");
	mi5=new MenuItem("copy");
	mi6=new MenuItem("paste");
	m2.add(mi4);
	m2.add(mi5);
	m2.add(mi6);

	mi7=new MenuItem("Tools");
	mi8=new MenuItem("Options");
	mi9=new MenuItem("page Numbers");
	m3.add(mi7);
	m3.add(mi8);
	m3.add(mi9);
	
	mb1.add(m1);
	mb1.add(m2);
	mb1.add(m3);
	setMenuBar(mb1);
	}
}