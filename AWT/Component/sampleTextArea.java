import java.applet.*;
import java.awt.*;


/*<applet code = "sampleTextArea.class"  width = 600 height=600></applet>*/

public class sampleTextArea extends Applet 
{
  public void init()
  {
	String str = "";
        TextArea txt=new TextArea(str,10,30);
         add(txt);

  }
}
