package io;
import java.io.FileOutputStream;
public class ByFileOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("D:\\Code.txt");  //destination
			String s="Girls on top";
			byte b[]=s.getBytes();  //converting string into byte
			f.write(b);
			f.close();
			System.out.println("yhan kyu dekh rhe ho..! jake file mein dekho!!! ");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
