package io;
import java.io.*;;
public class CopyAndPaste {

	public static void main(String[] args) {
		try {
			FileInputStream in=new FileInputStream("D://Code.txt");  //read
			FileOutputStream out=new FileOutputStream("D://store.txt"); //print
			byte[] arr=new byte[1024];
			int l;
			while((l=in.read(arr))> 0) {
				out.write(arr);
			}
			in.close();
			out.close();
			System.out.println("Done!");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
