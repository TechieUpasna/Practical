package thread;

public class Daemon extends Thread{
public void run() {
	if(Thread.currentThread().isDaemon()) {
		System.out.println(Thread.currentThread().getName());  //to show current thread
		System.out.println("Demon....");
	}
	else {
		System.out.println(Thread.currentThread().getName());
		System.out.println("User....");
	}
}
	public static void main(String[] args) {
		Daemon t=new Daemon();
		Daemon u=new Daemon();
		Daemon p=new Daemon();
		t.setDaemon(true);  
		p.setDaemon(true);
		t.start();
		u.start();
		p.start();

	}

}
