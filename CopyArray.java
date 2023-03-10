package homeAssignment;

public class CopyArray {

	public static void main(String[] args) {
	char[] a= {'U','P','A','S','N','A'};
	char[] b=new char[10];
	System.arraycopy(a, 1, b, 2, 5);  
	System.out.println(String.valueOf(b));

	}

}
