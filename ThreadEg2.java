package thread;
//directly we use thread class without extends
//without using .setName to name a thread
//.getName
public class ThreadEg2 {
public void run() {
	System.out.println("Aggarwal");
}
	public static void main(String[] args) {
		Thread t=new Thread("Upasna");
		ThreadEg2 t1=new ThreadEg2();
		t.start();
		t1.run();
		System.out.println(t.getName());
	}

}
