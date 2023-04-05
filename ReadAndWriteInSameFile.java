package io;
import java.io.*;
public class ReadAndWriteInSameFile {

	public static void main(String[] args)throws Exception{
		FileWriter w=new FileWriter("D://store.txt");
		w.write("Let's do it!!");
		w.close();
		FileReader r=new FileReader("D://store.txt");
		int i;
		while((i=r.read())!=-1) {
			System.out.print((char)i);
			}
		
		r.close();
		System.out.println("\nDone!");

	}

}
