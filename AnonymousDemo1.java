package AnonymousIinnerClass;
 
//public class AnonymousDemo1 implements Runnable
public class AnonymousDemo1 extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		AnonymousDemo1 nit = new AnonymousDemo1();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}