package exceptionHandling;
import java.util.Scanner;
public class InputMismatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		try {
			//taking input
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println("result: "+x/y);
		}
		catch(Exception a) {
			System.out.println(a);
			System.out.println("Error");
		}
	}
	

}
