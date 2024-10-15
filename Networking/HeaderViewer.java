import java.net.*;
import java.io.*;
import java.util.*;
public class HeaderViewer
{
public static void main(String args[])
{
try
{
URL u = new URL("http://www.rediffmail.com/index.html");
URLConnection uc = u.openConnection( );
System.out.println("Content-type: " +
uc.getContentType( ));
System.out.println("Content-encoding: "
+ uc.getContentEncoding( ));
System.out.println("Date: " + new Date(uc.getDate( )));
System.out.println("Last modified: "
+ new Date(uc.getLastModified( )));
System.out.println("Expiration date: "
+ new Date(uc.getExpiration( )));
System.out.println("Content-length: " +
uc.getContentLength( ));
} // end try
catch (MalformedURLException ex)
{
System.out.println("I can't understand this URL...");
}
catch (IOException ex)
{
System.err.println(ex);
}
System.out.println( );
} // end main
}