package thread;

class Thread_test{
	synchronized void display(int num) {
		for(int i=0;i<=5;i++) {
			System.out.println(num+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class SynchronizedEg {

	public static void main(String[] args) {
		Thread_test obj=new Thread_test(); 
		//1st thread
		Thread t1=new Thread() {
			public void run() {
				obj.display(2);
			}
		};
//2nd Thread
		Thread t2=new Thread() {
			public void run(){
				obj.display(5);
			}
		};
		t1.start();
		t2.start();
	}

}
