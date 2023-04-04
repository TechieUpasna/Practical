package io;
import java.io.FileInputStream;
public class ReadSingleChar {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("D:\\Code.txt");
		//read single char
		int i=f.read();
		System.out.println((char)i);   //converting byte to char by casting char over here
		f.close();
	}
		catch(Exception e) {
			System.out.println(e);
		}
		}

}
