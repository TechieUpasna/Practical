package exceptionHandling;

public class Nested_try2 {

	public static void main(String[] args) {
		//outer try block
		try {
			
			
			//1st inner try block
			try {
				int a=10/0;
				System.out.println(a);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			//2nd inner try block
			try {
				int arr[]=new int [3];
				int a=5;
				arr[20]=22;
				System.out.println(a);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Both inner try done");
		}
//outer catch
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("done");
	}

}
