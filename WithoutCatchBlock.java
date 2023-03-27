package exceptionHandling;
//we can try finally after try block...but it will not act like finally block!
public class WithoutCatchBlock {

	public static void main(String[] args) {
		int arr[]=new int [3];
		try {
			
		}
		finally {
			arr[7]=3;      //as it found error here so it will not print upcoming lines
			System.out.println(arr[1]);
			System.out.println("Finally");
		}

	}

}
