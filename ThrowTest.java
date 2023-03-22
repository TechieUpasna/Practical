package exceptionHandling;

public class ThrowTest {
//defining method
	public static void checknum(int num) {
		if(num<0) {
			throw new ArithmeticException("Number is negitive");
		}
		else {
			System.out.println("Number is positive");
		}
	}
	public static void main(String[] args) {
		checknum(-1);
		System.out.println("Executed");

	}

}
