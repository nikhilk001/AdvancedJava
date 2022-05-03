
class MyThread extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hello child1 " +(i+1));
		}
	}
	
	
}

class MyThread1 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hello child2 " +(i+1));
		}
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
//		
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Hello Parent "+(i+1));
		}
	}

}
