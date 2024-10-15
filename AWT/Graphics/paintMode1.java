import java.awt.event.*;

import java.applet.*;
import java.awt.*;

/*
<applet code="paintMode" width=300 height=200>
</applet>
*/
public class paintMode1 extends Applet {
	int chsX = 100, chsY = 100;

	public paintMode1() {
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent me) {
				int x = me.getX();
				int y = me.getY();
				chsX = x - 10;
				chsY = y - 10;
				repaint();
			}
		});

	}

	public void paint(Graphics g) {

		g.drawLine(0, 0, 100, 100);
		g.drawLine(0, 100, 100, 0);
		g.setColor(Color.blue);
		g.drawLine(40, 25, 250, 180);
		g.drawLine(75, 90, 400, 400);

		g.setColor(Color.green);
		g.drawLine(20, 150, 400, 40);
		g.setColor(Color.red);
		g.drawOval(10, 10, 50, 50);
		g.fillOval(70, 90, 140, 100);
		g.setXORMode(Color.black);
		g.drawLine(chsX - 10, chsX, chsY - 10, chsY);
		g.drawLine(chsX, chsX - 10, chsY, chsY - 10);
		g.setPaintMode();
	}
}