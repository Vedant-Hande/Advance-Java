// Displaying different fonts
import java.awt.Font;
import java.awt.Graphics;
import java.applet.Applet;
/*
<applet code="Fonts" width=300 height=150>
</applet>
*/
public class Fonts extends Applet
{
public void paint(Graphics g)
{

Font f1 = new Font("TimesRoman", Font.PLAIN, 18);
Font f2 = new Font("Courier", Font.BOLD, 16);
Font f3 = new Font("Arial", Font.ITALIC, 20);
Font f4 = new Font("Times", Font.BOLD + Font.ITALIC,22);

g.setFont(f1);
g.drawString("Times Roman plain font: 18", 10, 30);
g.setFont(f2);
g.drawString("Courier bold font: 16", 10, 60);
g.setFont(f3);
g.drawString("Arial italic font: 20", 10, 80);
g.setFont(f4);
g.drawString("Times bold italic font: 22", 10, 120);


}
}










