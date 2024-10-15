import java.awt.*;
import java.awt.event.*;



class SampleFrame extends Frame
{
   SampleFrame(String tittle)
	{
	  super(tittle);
	  
	}
}



class FileDialogDemo1
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