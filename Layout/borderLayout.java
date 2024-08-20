import java.awt.*;
import java.applet.*;

/*<applet code="borderLayout.class" width=800 height=800>
</applet> */

public class borderLayout extends Applet {
    Button button1, button2, button3, button4, button5, button6;

    public void init() {
        BorderLayout layout = new BorderLayout(10, 10);

        setLayout(layout);

        button1 = new Button("Button1");

        button2 = new Button("Button2");

        button3 = new Button("Button3");

        button4 = new Button("Button4");

        button5 = new Button("Button5");

        add("North", button1);

        add("South", button2);

        add("East", button3);

        add("West", button4);

        add("Center", button5);

    }

    public void paint(Graphics g) {

    }

}