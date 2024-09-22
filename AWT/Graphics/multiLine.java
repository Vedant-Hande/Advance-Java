//display multiple line of text using FontMetrics
import java.awt.*;
import java.applet.*;
/*<applet code="MultiLine" width=200 height=200>
</applet>
*/
public class MultiLine extends Applet{
int curX=0, curY=0;
public void init(){
Font f=new Font("SanfAerif",Font.ITALIC,20);
setFont (f);
}
public void paint(Graphics g){
FontMetrics fm=g.getFontMetrics();
nextLine("this is first line. ",g);
sameLine("this is same line",g);
nextLine("this is second line",g);
nextLine("this is third line",g);
}
void nextLine(String s,Graphics g){
FontMetrics fm=g.getFontMetrics();
curY+=fm.getHeight();                      
curX=0;
g.drawString(s,curX,curY);
curX=fm.stringWidth(s);}void sameLine(String s,Graphics g){
FontMetrics fm=g.getFontMetrics();
g.drawString(s,curX,curY);
curX+=fm.stringWidth(s);
}
}
