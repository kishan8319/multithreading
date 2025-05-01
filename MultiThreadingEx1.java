package AnonymousIinnerClass;

//public class MultiThreadingEx1

//public class MultiThreadingEx1 extends Thread
//public class MultiThreadingEx1 extends Thread

public class MultiThreadingEx1 implements Runnable
//public class MultiThread implements Runnable
{
	Thread thread;
	public MultiThreadingEx1() {
		thread = new Thread(this,"NareshIT");
		thread.setPriority(6);
		thread.start();
		thread.stop();
	}
	public void run() {
		
		System.out.println(thread);
		
	}
	public static void main(String[] args) {
		new MultiThreadingEx1();
	}
}