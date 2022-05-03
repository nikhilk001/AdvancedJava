import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("https://mitaoe.ac.in/mitaoe-student-affairs.php");
		System.out.println("Protocol is "+url.getProtocol() );
		System.out.println("Host Name is "+url.getHost() );
		System.out.println("PortNumber is "+url.getPort() );
		System.out.println("Path is "+url.getPath() );
		System.out.println("File is "+url.getFile() );
		System.out.println("Query is "+url.getQuery() );
		System.out.println("URL is "+url);
	}

}
