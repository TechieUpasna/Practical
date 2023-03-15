package regrexPattern;
import java.util.regex.*;
public class Regrex1 {
//[a-zA-Z] any character from lower to upper case
//[^abc] except these 3 character
//[abc] only these 3 character
//	x? - x occur once or not at all
//x+ -- x occur once or more than one
//x* -- x occur zero or more time
//	x{n} -- x occur n times x{7} only 7 char
//	x{n,} --x occurs n or more
	public static void main(String[] args) {
//		boolean b1=Pattern.matches("[a-zA-Z]", "a");
//		boolean b2=Pattern.matches("[pqr]", "a");
//		boolean b3=Pattern.matches("[^a-z]", "A");
//		System.out.println(b1+" "+b2+" "+b3);
//		
//		
//		//pallabi.Anudip@2023
//		boolean b4=Pattern.matches("[A-Za-z0-9.@]{19,}","pallabi.Anudip@2023" );
//		System.out.println(b4);
//		
//		//phone number
//		boolean b5=Pattern.matches("{6789}{1}[0-9]{9}","9555036869" );
		
		
		//email ID
		//first method
		boolean b6=Pattern.matches("[A-Za-z0-9.@]{19,}","upasnaaggarwal09@gmail.com" );
		System.out.println(b6);
		
		//email
		//second method
		boolean b7=Pattern.matches("[A-Za-z0-9.@]{19,}","upasnaaggarwal09@gmail.com" );
		System.out.println(b7);
	}

}
