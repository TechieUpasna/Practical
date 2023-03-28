package thread;

public class CurrentThread extends Thread{
public void run() {
	System.out.println(Thread.currentThread().getName());
}
	public static void main(String[] args) {
	CurrentThread t=new CurrentThread();
	CurrentThread t1=new CurrentThread();
	t.start();
	t1.start();

	}

}
