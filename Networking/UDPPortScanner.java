//The UDP Port Scanner [Ref. 1].
import java.net.*;
public class UDPPortScanner
{
public static void main(String[] args)
{
for (int port = 0; port <= 2000; port++)
{
try
{
// the next line will fail and drop into the catch block if
// there is already a server running on port i
DatagramSocket server = new DatagramSocket(port);
server.close( );
}
catch (SocketException ex)
{
System.out.println("There is a server on port " +
port + ".");
} // end try
} // end for
}
}