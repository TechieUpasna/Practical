package io;
import java.io.FileOutputStream;

//byte to single character
public class StringToByte {

	public static void main(String[] args) {
		try {
		FileOutputStream f=new FileOutputStream("D:\\Code.txt");
f.write(85);   //byte value  ASCII value
f.close();
System.out.println("Ho gya");}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
