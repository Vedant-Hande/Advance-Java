import java.awt.*;
import java.awt.event.*;



class SampleFrame extends Frame
{
   SampleFrame(String tittle)
	{
	  super(tittle);
	  MyWindowadapter adapter=new MyWindowadapter(this);
	  addWindowListener(adapter);
	}
}

class MyWindowadapter extends WindowAdapter
{	
	  SampleFrame s;
 	  public MyWindowadapter(SampleFrame s)
	  {
	    this.s=s;
	  }

public void windowClosing(WindowEvent we)
{
  s.setVisible(false);
}

}

class FileDialogDemo
{
  public static void main(String args[])
   {
      Frame f=new SampleFrame("File Dialog Demo"); 
       f.setSize(300,300);
       f.setVisible(true);
       FileDialog fd=new FileDialog(f,"FileDialog");
       fd.setVisible(true);
   }
}