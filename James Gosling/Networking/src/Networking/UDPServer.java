package Networking;

import java.io.*;
import java.net.*;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(80);
		
		System.out.println("Server Strated");
		//empty packet
		byte [] buf = new byte[1000];//buffer to receive msg from client
		
		DatagramPacket dp = new DatagramPacket(buf,1000);
		ds.receive(dp);
		
		String str = new String(buf);//byte to string
		
		System.out.println("Msg from client:"+ str);
		
		ds.close();
		
	}

}
