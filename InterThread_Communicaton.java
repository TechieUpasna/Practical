package thread;

//with notify() wait() notifyAll()
class Aab{
	int i;
	boolean flag=false;
	synchronized void display(int i) {
		if(flag)
			try {
				wait();
			}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		this.i=i;
		flag=true;
		System.out.println("Data Displayed: "+i);
		notify();
	}
	synchronized int receive() {
		if(!flag)
			try {
				wait();
			}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Data Received: "+i);
		flag=false;
		notifyAll();
		return i;

	}
}
class Thread41 extends Thread{
	Aab obj;
	Thread41(Aab obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.display(j);
		}
	}
}
class Thread51 extends Thread{
	Aab obj;
	Thread51(Aab obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.receive();
		}
	}
}

public class InterThread_Communicaton {

	public static void main(String[] args) {
		
		Aab obj=new Aab();
		Thread41 t=new Thread41(obj);
		Thread51 u=new Thread51(obj);
		t.start();
		u.start();
	}

}
