import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class MyRunnablePoolEx implements Runnable
{
	public String name;
	public MyRunnablePoolEx(String name) 
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

public class PoolEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(5);
		ExecutorService ex = Executors.newFixedThreadPool(4);
		for(int i=0;i<20;i++)
		{
			Runnable r = new MyRunnablePoolEx("Painter " +i);
			Runnable r1 = new MyRunnablePoolEx("Electrician " +i);
			executor.execute(r);
			ex.execute(r1);
		}
	}

}
