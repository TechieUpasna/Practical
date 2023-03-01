package objectandclass;
//static binding (private,final static)
public class StaticBinding {
private void display() {
	System.out.println("something");
}
	public static void main(String args[]) {//main method
		StaticBinding sb = new StaticBinding();//main class object
		sb.display();
	
}
}
