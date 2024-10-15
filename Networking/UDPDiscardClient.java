import java.net.*;
import java.io.*;
public class UDPDiscardClient
{
public static void main(String[] args)
{
String hostname = "localhost";
int port = 9;
try
{
InetAddress server = InetAddress.getByName(hostname);
BufferedReader userInput
= new BufferedReader(new InputStreamReader(System.in));
DatagramSocket theSocket = new DatagramSocket( );
while (true)
{
String theLine = userInput.readLine( );
if (theLine.equals(".")) break;
byte[] data = theLine.getBytes( );
DatagramPacket theOutput
= new DatagramPacket(data, data.length, server, port);
theSocket.send(theOutput);
} // end while
} // end try
catch (UnknownHostException uhex) {
System.err.println(uhex);
}
catch (SocketException se) {
System.err.println(se);
}
catch (IOException ioex) {
System.err.println(ioex);
}
} // end main
}