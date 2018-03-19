import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import java.io.PrintWriter;

/**
 * 
 * @author guill
 *	Table of commande possible
 *		- getFiles
 *		- getFile(n°File)
 *		- getAddressIP
 *		- 
 *	List
 *		-Files (global list of clients)
 *		-Clients (IP + Name + Files)
 *		
 */


public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		Thread access = new Thread( new ClientAcceptThread());
		access.start();
		
		System.out.println("Test");
	}
	
}
