package io;
import java.io.FileInputStream;

//for all characters
public class Read_WholeString {

	public static void main(String[] args) {
	try {
		FileInputStream f=new FileInputStream("D:\\Code.txt");
		int i=0;
		while((i=f.read())!=-1) {
			System.out.print((char)i);
		}
		f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
