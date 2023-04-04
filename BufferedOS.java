package io;
import java.io.*;
public class BufferedOS {
//connecting 2 different streams
	public static void main(String[] args) {
		try {
		FileOutputStream f=new FileOutputStream("D:\\Code.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
		String s="YO bro....! What's up";
		byte a[]=s.getBytes();
		f.write(a);
		b.flush();  //flushes data from one stream to another
		f.close();
		b.close();
		System.out.println("Ho gya!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
