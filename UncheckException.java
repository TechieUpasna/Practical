package exceptionHandling;

public class UncheckException {
public void display() {
	String a="This is Upasna";
	System.out.println(a);
	try {
	//Arithmetic Exception
	int i=50/0;
	System.out.println(i);
	
	//null pointer
	String s="null";
	System.out.println(s.length());
	
	//ArrayIndexOutOfBound Exception
	int arr[]=new int [5];
	arr[7]=10;
	
	//number format exception
	String b="Upasna";
			int n=Integer.parseInt(b);
	System.out.println(b);}
	catch(Exception e) {
		System.out.println(e);
	}
}
	public static void main(String[] args) {  //main method
		UncheckException obj=new UncheckException();  //object
		obj.display();

	}

}
