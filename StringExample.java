package strings;
//char[] work same as java string
public class StringExample {
public void show() {  //method
	char [] arr= {'J','A','V','A'};  //char type array
	System.out.println(arr);
	String s=new String(arr);
	System.out.println("Value is: "+s);
}
public void display() {   //method 2
	String s1="Upasna";
	String s2=new String(s1);
	System.out.println(s2);
}
	public static void main(String[] args) {
		StringExample str=new StringExample();
		str.show();
		str.display();

	}

}
