import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClientAcceptThread implements Runnable {

	static final int PORT = 45000;
	static final String INTERFACE = "eth0";
	
	ServerSocket mySkServer;
	InetAddress localAddress = null;
	Socket srvSocket = null;
	int nbr_client = 0;
	ArrayList<Client> myclients = new ArrayList<>();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {

			NetworkInterface ni = NetworkInterface.getByName(INTERFACE);
			Enumeration<InetAddress> inetAddresses = ni.getInetAddresses();
			while (inetAddresses.hasMoreElements()) {
				InetAddress ia = inetAddresses.nextElement();

				if (!ia.isLinkLocalAddress()) {
					if (!ia.isLoopbackAddress()) {
						System.out.println(ni.getName() + "->IP: " + ia.getHostAddress());
						localAddress = ia;
					}
				}
			}

			// Warning : the backlog value (2nd parameter is handled by the implementation
			mySkServer = new ServerSocket(PORT, 10, localAddress);

			// set 3min timeout
			mySkServer.setSoTimeout(180000);

			System.out.println("Default Timeout :" + mySkServer.getSoTimeout());
			System.out.println("Used IpAddress :" + mySkServer.getInetAddress());
			System.out.println("Listening to Port :" + mySkServer.getLocalPort());

			while(nbr_client < 10)
			{
			// wait for client connection
			srvSocket = mySkServer.accept();
			
			System.out.println("client is connected");
			//String message = "";	
			}
			//new ClientEchoThread(srvSocket);	
		} catch (SocketException e) {

			System.out.println("Connection Timed out");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
