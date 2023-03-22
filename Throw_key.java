package exceptionHandling;
//whether the person is eligible for java course

public class Throw_key {
public static void check(int marks) {
	if(marks>60) {
		throw new ArithmeticException("Student is eligible ");
	}
	else {
		System.out.println("Not eligible");
	}
}
	public static void main(String[] args) {
	check(78);
	}

}
