package thread;
//with or without run method
public class SleepMethod extends Thread{
public void run() {
	for(int i=0;i<=5;i++) {
		try {
	
			Thread.sleep(800);  //we cannot give a negative number to this... 
			//it will show an exception 
			
			
			
			System.out.println(i);
		}
	
catch(InterruptedException e) {
System.out.println(e);
}
	System.out.println(i);
}}
	public static void main(String[] args) {
		SleepMethod obj=new SleepMethod();
		SleepMethod obj1=new SleepMethod();
		obj.start();
		obj1.start();
//		try {
//			for(int i=0;i<=5;i++) {
//				Thread.sleep(800);
//				System.out.println(i);
//			}
//		}
//catch(InterruptedException e) {
//	System.out.println(e);
//}
	}

}
