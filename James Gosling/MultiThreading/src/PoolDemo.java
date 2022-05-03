import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnablePool implements Runnable
{
	public String name;
	public MyRunnablePool(String name) 
	{
		this.name = name;
	}
	public void run() 
	{
		System.out.println("Thread :"+Thread.currentThread().getId()+" Started.");
		System.out.println("Thread :"+Thread.currentThread().getId()+" Executing "+name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread :"+Thread.currentThread().getId()+" Stopped.");
	}
}
public class PoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0;i<6;i++)
		{
			Runnable r = new MyRunnablePool("My Job " +i);
			executor.execute(r);
		}
	}

}
