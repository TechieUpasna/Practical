package thread;

public class ThreadPriority extends Thread {
public void run() {
	for(int i=0;i<=5;i++) {
		try {
			Thread.sleep(800);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread());
		t1.start();
		t2.start();
		t3.start();
		t1.setName("Upasna");
		System.out.println(t1.getName());

	}

}
