import java.awt.*;
import javax.swing.*;
/*
<applet code="JTableDemo" width=400 height=200>
</applet>
*/
public class JTableDemo extends JApplet
{
public void init()
{
Container contentPane = getContentPane();
contentPane.setLayout(new BorderLayout());
final String[] colHeads = { "Name", "Phone", "Fax" };
final Object[][] data = {{ "Pramod", "4567", "8675" },
{ "Tausif", "7566", "5555" },
{ "Nitin", "5634", "5887" },
{ "Amol", "7345", "9222" },
{ "Vijai", "1237", "3333" },
{ "Ranie", "5656", "3144" },
{ "Mangesh", "5672", "2176" },
{ "Suhail", "6741", "4244" },
{ "Nilofer", "9023", "5159" },
{ "Jinnie", "1134", "5332" },
{ "Heena", "5689", "1212" },
{ "Saurav", "9030", "1313" },
{ "Raman", "6751", "1415" }
};
JTable table = new JTable(data, colHeads);
int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp = new JScrollPane(table, v, h);
contentPane.add(jsp, BorderLayout.CENTER);
}
}