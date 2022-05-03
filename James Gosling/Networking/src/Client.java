import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost",80);
		System.out.println("Cient Started...");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Message for server:");
		String msg = br.readLine();
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF(msg);
		dout.flush();//flush is used to send msg to serverclient
		//dout.close();
		s.close();
	}

}
