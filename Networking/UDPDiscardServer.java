import java.net.*;
import java.io.*;
public class UDPDiscardServer
{
public static void main(String[] args)
{
int port = 9;
byte[] buffer = new byte[65507];
try
{
DatagramSocket server = new DatagramSocket(port);
DatagramPacket packet = new
DatagramPacket(buffer, buffer.length);
while (true)
{
try
{
server.receive(packet);
String s = new String(packet.getData( ),
0, packet.getLength( ));
System.out.println(packet.getAddress( ) + " at port "
+ packet.getPort( ) + " says " + s);
// reset the length for the next packet
packet.setLength(buffer.length);
}
catch (IOException ex) {
System.err.println(ex);
}
} // end while
} // end try
catch (SocketException ex)
{
System.err.println(ex);
} // end catch
} // end main
}