//2. Create a scroll bar on applet. When we change its position the current thumb position of it //will get displayed on the status bar.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="scrollBar" width=300 height=300>
</applet>*/

public class scrollBar extends Applet
{
Mbar mb;

public void init()
{
           mb=new Mbar(Scrollbar.HORIZONTAL,0,1,0,100);
           add(mb);
}

class Mbar extends Scrollbar
{
public Mbar(int style,int i,int t,int min,int max)
{
super(style,i,t,min,max);
enableEvents(AWTEvent.ADJUSTMENT_EVENT_MASK);
}
protected void processAdjustmentEvent(AdjustmentEvent ae)
{

showStatus("Thumb Value is " +ae.getValue());
setValue(getValue());
super.processAdjustmentEvent(ae);

}
}
}

