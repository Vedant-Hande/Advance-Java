import java.io.*;
import java.net.*;
class PwdClient
{
  public static void main(String args[])
  {
    try
	{
	  Socket so =new Socket("localhost",3642);
	  DataInputStream d =new DataInputStream(System.in);
	  System.out.println("Enter a Password");
	  String passwd =d.readLine();
	  PrintStream p = new PrintStream(so.getOutputStream());
	  p.println(passwd);
	  DataInputStream d1 =new DataInputStream(so.getInputStream());
	  
	   String r =d1.readLine();
	  System.out.println(r);
	  so.close();
	}
	catch( Exception e)
	{
	  System.out.println("Msg from client: "+e);
	}
  }
}







