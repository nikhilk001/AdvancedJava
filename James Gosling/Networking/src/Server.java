import java.io.*;
import java.net.*;
public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(80);
		System.out.println("Server Started....");
		
		Socket s = ss.accept();
		System.out.println("Connection ready to use.");
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		String data = (String)din.readUTF(); 
		
		System.out.println("Message from client:"+data);
		s.close();
		ss.close();
	}

}
