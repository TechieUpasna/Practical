package thread;

//with or without synchronization

class MyThreadClass{
	synchronized void print(int num) {
		for(int i=0;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread{
	MyThreadClass mt;
	
	Thread1(MyThreadClass mt){
		this.mt=mt;
	}
	public void run() {
		mt.print(5);
	}
}
class Thread2 extends Thread{
	MyThreadClass mt;
	Thread2(MyThreadClass mt){
		this.mt=mt;
	}
	public void run() {
		mt.print(2);
	}
}
public class Synchronization {
	public static void main(String[] args) {
		MyThreadClass obj=new MyThreadClass();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();

	}

}
