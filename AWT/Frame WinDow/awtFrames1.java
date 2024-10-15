import java.awt.*;

class SampleFrame extends Frame {
    SampleFrame() {
        super("My First Frame");
    }

}

public class awtFrames1 extends Frame {

    public static void main(String args[]) {
        Frame f = new SampleFrame();
        f.setSize(250, 250);
        f.setVisible(true);

    }

}