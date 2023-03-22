package exceptionHandling;

public class Finally_block2 {
//finally block will occur in all conditions
	public static void main(String[] args) {
		//exception not occur
		try {
			int a=4/2;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//exception occur
		try {
			int a=40/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		//exception occur but not handled
		try {
			int a=40/0;
			System.out.println(a);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		
		
		finally {
			System.out.println("Finally!");
		}
	}

}
