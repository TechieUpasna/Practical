package thread;
//creating thread by extending thread class
public class ThreadEg extends Thread{
public void run() {
	System.out.println("I am a thread.... ");
}
	public static void main(String[] args) {
		ThreadEg t=new ThreadEg();  //reference variable of thread
		t.start();
		t.setName("Upasna");
		String s=t.getName();
		System.out.println(s);

	}

}
