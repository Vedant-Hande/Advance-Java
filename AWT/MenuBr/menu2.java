import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Dimension;
/*
<Applet code=menu2 width=500 height=500>
</Applet>
*/
 public class menu2 extends Applet
{
	Dimension d1=new Dimension(300,300);
	public void init()
	{
	Frame f1=new MakeFrame("MY FRAME");
	f1.setSize(d1);
	f1.setVisible(true);
	}

}

class MakeFrame extends Frame implements ActionListener
{

   Label l1;
   MenuBar mb;
   Menu mm1,mm2;
   MenuItem sm1,sm2,sm3,sm4;
   
  MakeFrame(String tit)
 {
     super(tit);
     MenuBar mb = new MenuBar();
     setMenuBar(mb);
 
    Menu mm1 = new Menu("Math Opern");
    mb.add(mm1);

    Menu mm2 = new Menu("String Opern");
    mb.add(mm2);

   MenuItem sm1 = new MenuItem("Add"); 
   sm1.addActionListener(this);
   MenuItem sm2 = new MenuItem("Sub"); 
   sm2.addActionListener(this); 
   mm1.add(sm1); 
   mm1.add(sm2);


   MenuItem sm3 = new MenuItem("String Length"); 
   sm3.addActionListener(this);
   MenuItem sm4 = new MenuItem("String Concate"); 
   sm4.addActionListener(this); 
   mm2.add(sm3); mm2.add(sm4);

   l1= new Label("Menu Demo");
   add(l1);
 }

    
 public void actionPerformed(ActionEvent ae)
  {
        String x = ae.getActionCommand();   
        if( x.equals("Add") ) { l1.setText("code to add");  }
		if( x.equals("String Length") ) {l1.setText("code to find String length");  }                
  }

}

