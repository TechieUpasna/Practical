package thread;
class A{
	int num;
	boolean valueset=false;
	public synchronized void put(int num) {
		while (valueset) {
			try {
				wait();
			}
			catch(Exception e) {}}
				System.out.println("put: "+num);
				this.num=num;
				valueset=true;
				notify();
	}
	public synchronized void get() {
		while(!valueset) {
			try {
				wait();
			}
			catch(Exception e) {}
		}
		System.out.println("Get: "+num);
		valueset=false;
		notify();
	}
}
class Producer implements Runnable{
A a;
public Producer(A a) {
	this.a=a;
	Thread t1=new Thread(this,"Producer");
	t1.start();
}
public void run() {
	int i=0;
	while(true) {
		a.put(i++);
		try {Thread.sleep(1000);}
		catch(Exception e) {}
	}
}
}
class Consumer implements Runnable {
	A a;
	public Consumer(A a) {
		this.a=a;
		Thread t2=new Thread(this,"Consumer");
		t2.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.get();
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
}}
public class InterCommunicationThread {

	public static void main(String[] args) {
	A a=new A();
	new Producer(a);
	new Consumer(a);
	}

}
