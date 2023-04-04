package io;
import java.io.*;

//read the data from source file by using BufferedInputStream
public class BufferInput {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("D:\\Code.txt");   //source file
		BufferedInputStream b=new BufferedInputStream(f);
		int i;
		while((i=b.read())!=-1) {
			System.out.print((char)i);
		}
		f.close();
		b.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
