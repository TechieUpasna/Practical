package thread;

public class RunnableInterface implements Runnable{
public void run() {
	System.out.println("Hi... am thread");
}
	public static void main(String[] args) {
		RunnableInterface a=new RunnableInterface();
		Thread t= new Thread(a);
		t.start();
	}

}
