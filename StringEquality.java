package strings;
import java.util.Scanner;
public class StringEquality {

	public static void main(String[] args) {
	String a,b; 
	Scanner sc= new Scanner(System.in);
	System.out.println("1st String: ");
	a=sc.next();
	System.out.println("2nd string: ");
b=sc.next();
if(a.equals(b)) {//compare original content of string
	System.out.println("Equal");
	}
	else {
		System.out.println("Unequal");
	}
if(a.compareTo(b)>0) {  //compare lexicographically
	System.out.println("Equal");
}
else {
	System.out.println("Unequal");
}
if(a==b) {//== compare reference not value
	System.out.println("Equal");
}
else {
	System.out.println("Unequal");
}

	}

}
