import java.applet.Applet;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment; 
/*
<applet code="ShowFonts" width=550 height=60>
</applet>
*/

public class ShowFonts extends Applet
{
public void paint(Graphics g)
{
String msg = "";
String FontList[];
GraphicsEnvironment ge = new GraphicsEnvironment();
FontList = ge.getAvailableFontFamilyNames();
for(int i = 0; i < FontList.length; i++)
msg += FontList[i] + " ";
g.drawString(msg, 4, 16);
}
}