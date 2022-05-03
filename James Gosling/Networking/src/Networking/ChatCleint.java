package Networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatCleint {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost",80);
		System.out.println("Client Started...");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		//to receive from server
		BufferedReader bb = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		
		String msg , str;
		
		while(!(msg = br.readLine()).equals("exit")) {
			dout.writeUTF(msg);
			str = bb.readLine();
			
			System.out.println("Message from Server :"+str);;
		}
		
		bb.close();
		br.close();
		s.close();
	}

}
