import java.awt.*;
import java.applet.*;

/* <applet code="AppFrame.class" width=800 height=800></applet>*/

class sampleFrame extends Frame {
  sampleFrame(String title) {
    super("title");
  }

}

public class AppFrame extends Applet {
  Frame f;

  public void init() {
    f = new sampleFrame("An Example frame Window");
    f.setSize(100, 100);
    f.setVisible(true);

  }

  public void start() {
    f.setVisible(true);

  }

  public void paint(Graphics g) {

    g.drawString("Applet Window", 100, 200);
  }

}