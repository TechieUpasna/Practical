package exceptionHandling;

public class FinallyBlock {
//Whether there is any exception is or not.. finally block will execute
	
	
	static void error() {
		try {
			int i=50/0;  //arithmetic
			System.out.println(i);
			int arr[] =new int [5];
			arr[7]=5;  //ArrayBound
		}
		catch(ArithmeticException e) {
			System.out.println("Only one arithmetic exception will execute");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Now array index out of bound will occure");
		}
		finally {
			System.out.println("sorted!");
		}
	}
	public static void main(String[] args) {
		error();

	}

}
