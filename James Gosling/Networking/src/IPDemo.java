import java.net.*;
import java.io.*;
public class IPDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Website URL:");
		String sitename = br.readLine();
		
		InetAddress in = InetAddress.getByName(sitename);
		System.out.println("The IP Address is "+in);
		
		InetAddress ip = InetAddress.getLocalHost();
        String str = ip.getHostAddress();  
        System.out.println("The host Address is :"+ str);  
		
		
		InetAddress ad1 = InetAddress.getByName("132.10.1.2");
		InetAddress ad2 = InetAddress.getByName("132.10.1.2");
		System.out.println("Comparison: "+ad1.equals(ad2));
		
		 InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
	      for (int i = 0; i < addresses.length; i++) {
	        System.out.println(addresses[i]);
	      }
	}

}
