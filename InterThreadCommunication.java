package thread;
class Aa{
	int i;
	synchronized void display(int i) {
		this.i=i;
		System.out.println("Data Displayed: "+i);
	}
	synchronized int receive() {
		System.out.println("Data received:"+i);
		return i;
	}
}
class Thread4 extends Thread{
	Aa obj;
	Thread4(Aa obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.display(j);
		}
	}
}
class Thread5 extends Thread{
	Aa obj;
	Thread5(Aa obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.receive();
		}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Aa obj=new Aa();
		Thread4 t=new Thread4(obj);
		Thread5 u=new Thread5(obj);
		t.start();
		u.start();

	}

}
