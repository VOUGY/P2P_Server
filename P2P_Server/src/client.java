import java.net.InetAddress;
import java.util.List;

public class Client {

	InetAddress ownIP;
	String ownName;
	List<String> ownFiles; 
	
	public void client (InetAddress ownIP, String ownName)
	{
		this.ownIP = ownIP;
		this.ownName = ownName;
	}
	public void GetOwnFiles(List<String> ownFiles)
	{
		this.ownFiles = ownFiles;
	}
}
