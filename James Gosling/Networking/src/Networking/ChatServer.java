package Networking;

import java.io.*;
import java.net.*;


public class ChatServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(80);
		System.out.println("Server Started....");
		
		Socket s = ss.accept();
		System.out.println("Connection ready to use.");
		
		//to take input from server
		
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		
		//to tale client message
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		//to send message from server to client
		PrintStream ps = new PrintStream(s.getOutputStream());
		while(true) {
			String data,str;
			while(!(data = (String)din.readUTF()).equals("exit")) {
				System.out.println("Message from client:"+data);
				
				str = rb.readLine();
				
				ps.println(str);//send to client
				
			}
		}
	}

}
