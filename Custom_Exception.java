package exceptionHandling;



class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {  //constructor
		super(str);
	}
}
public class Custom_Exception {
static void checkage(int age)throws InvalidAgeException{
	if(age<18) {
		throw new InvalidAgeException("Not eligible to vote");
	}
	else {
		System.out.println("You can vote");
	}
}

//we can even use try and catch else this way!
	public static void main(String[] args) throws InvalidAgeException {
		checkage(20);

	}

}
