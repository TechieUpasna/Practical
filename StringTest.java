package strings;
import java.util.Scanner;
public class StringTest {
	String x="Hello";
	public void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a=sc.next();//1st string
		String b=sc.next();//2nd string
		System.out.println(a.length()+b.length());  //length()
		System.out.println((a.compareTo(b)>0)?"Yes":"No");  //compare()
		System.out.println(a.substring(0,4).toUpperCase()+a.substring(2)+" "+b.substring(0,3).toLowerCase()+b.substring(1)); //substring(), upper case(), lower case()
		System.out.println("Substring is: "+x.substring(0,3));
		System.out.println("Substring is: "+x.substring(2));
	}

	public static void main(String[] args) {
		StringTest t=new StringTest();
		t.show();

	}

}
