class MyRunnable implements Runnable{
	public void run()
	{
		System.out.println("Child Thread Earlier Priority:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("Child Thread Current Priority:"+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Thread ID:"+Thread.currentThread().getId());
			System.out.println("Hello child1 " +(i+1));
			Thread.currentThread().setName("UP");
			System.out.println("Thread Name:"+Thread.currentThread().getName());
		}
	}
}
public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main Thread Earlier Priority:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(3);
		System.out.println("Main Thread Current Priority:"+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			
			System.out.println("Hello Parent "+(i+1));
		}
	}

}
