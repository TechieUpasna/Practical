package exceptionHandling;

public class throwEg {
//whether student is pass or fail
	public static void display(int a) throws ArithmeticException {
		if(a>=0 && a<35) {
			//throw Arithmetic Exception if not then fail
			throw new ArithmeticException("you are fail");
		}
		else {
			System.out.println("You are pass!");
		}
	}
	//main method
	public static void main(String[] args) {
		//calling the function
		display(13);
		System.out.println("rest of the code.....");
	}

}
