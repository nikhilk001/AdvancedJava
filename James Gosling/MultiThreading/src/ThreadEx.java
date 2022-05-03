class Uddhav implements Runnable{
	public void run()
	{
		Thread.yield();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ID:"+Thread.currentThread().getId());
		
		Thread.currentThread().setName("uddhav");
		System.out.println("Thread Name:"+Thread.currentThread().getName());

	}
}
class pratik implements Runnable{
	public void run()
	{
		Thread.yield();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ID:"+Thread.currentThread().getId());
		
		Thread.currentThread().setName("pratik");
		System.out.println("Thread Name:"+Thread.currentThread().getName());

		
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		pratik p = new pratik();
		Thread t1 = new Thread(p);
		t1.start();
		t1.setPriority(9);
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Uddhav u = new Uddhav();
		Thread t = new Thread(u);
		t.start();
		t.setPriority(3);
		try {
			t.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread ID:"+Thread.currentThread().getId());
		
		Thread.currentThread().setName("Father");
//		Thread.currentThread().setPriority(3);
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		
	}

}
