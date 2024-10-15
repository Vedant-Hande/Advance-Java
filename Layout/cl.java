import java.awt.*;
import java.applet.*;

/*<applet code="cl.class" width=800 height=800>
</applet> */

public class cl extends Applet {
    CardLayout cardLayout;

    Panel panel;

    Button button1, button2, button3;

    public void init()

    {

        panel = new Panel();

        add(panel);

        cardLayout = new CardLayout(0, 0);

        panel.setLayout(cardLayout);

        button1 = new Button("Button1");

        button2 = new Button("Button2");

        button3 = new Button("Button3");

        panel.add("Button1", button1);

        panel.add("Button2", button2);

        panel.add("Button3", button3);

    }

    public boolean action(Event evt, Object arg)

    {

        cardLayout.next(panel);

        return true;

    }

}