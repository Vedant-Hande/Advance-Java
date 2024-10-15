import java.awt.Font;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.*;

/*
<applet code="colorDemo" width=300 height=200>
</applet>
*/
public class colorDemo extends Applet
{
public void paint(Graphics g)
{
Color c1 = new Color(202, 146, 20);
Color c2 = new Color(110, 169, 107);
Color c3 = new Color(160, 100, 200);
g.setColor(c1);
g.drawLine(0, 0, 100, 100);
g.drawLine(0, 100, 100, 0);
g.setColor(Color.red);
g.drawLine(40, 25, 250, 180);
g.setColor(c3);
g.drawLine(20, 150, 400, 40);
g.setColor(c2);
g.drawOval(10, 10, 50, 50);
g.fillOval(70, 90, 140, 100);
}
}