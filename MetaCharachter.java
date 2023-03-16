package regrexPattern;
import java.util.regex.*;
public class MetaCharachter {

	public static void main(String[] args) {
		// \d-[0-9]
		// \w-[a-zA-z0-9]
		// \s- white space character
boolean b1=Pattern.matches("\\w{9}", "Anudip123");
System.out.println(b1);
	}

}
