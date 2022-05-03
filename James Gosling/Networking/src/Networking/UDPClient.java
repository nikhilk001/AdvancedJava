package Networking;


import java.io.*;
import java.net.*;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		System.out.println("Client Strated");
		String msg = "Hi..";
		
		InetAddress ip = InetAddress.getByName("localhost");
		
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),ip,80);
		
		ds.send(dp);
		
		ds.close();
	}

}
