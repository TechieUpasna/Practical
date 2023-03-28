package thread;

public class RunnableInterface2 implements Runnable{
public void run() {
	System.out.println("Thread running");
}
	public static void main(String[] args) {
		//object
		RunnableInterface2 r=new RunnableInterface2();
		Thread t=new Thread(r,"Upasna");
		t.start();
		String s= t.getName();
		System.out.println(s);

	}

}
