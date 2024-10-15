/*
Create a communication between client and server.Client will 
send a request on port number 3642 for communication . 
Then server will ask for password.
The communication will not be established until the password is correct.
After inputting correct password,
the server will send : "Welcome" and close the communication.
*/

import java.net.*;
import java.io.*;
public class PwdServer
{
  public static void main(String [] args)
  {
    try
	{
	  PWServer p =new PWServer();
          System.out.println("Server Started ...");
	  p.activate();
	}
	catch(Exception e)
	{
	  System.out.println("Error: InSocket");
	}
  }
}
class PWServer
{
  public void activate()throws Exception
  {
    ServerSocket ss=new ServerSocket(3642);
	while(true)
	{
	  Socket so= ss.accept();
	  DataInputStream d =new DataInputStream (so.getInputStream());
	  String passwd=d.readLine();
	  String response;
          if(passwd.equals("mahesh"))
	  {
            response="welcome.....";
                System.out.print(" LOGIN SUCCESSFUL.....\n");
		}
		else
		{
		  response ="Invalid Password";
		}
		PrintStream p =new PrintStream(so.getOutputStream());
		p.println(response);
		so.close();
	  }
	}
  }

