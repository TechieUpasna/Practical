package io;
import java.io.ByteArrayInputStream;
//read byte array as input stream
public class Using_ByteArrayInputStream {

	public static void main(String[] args) {
		byte[] arr= {85,80,65,83,78,97};
		ByteArrayInputStream b=new ByteArrayInputStream(arr);
		int i=0;
		while((i=b.read())!=-1) {
			char ch=(char)i;
		
		System.out.println("Ascii character "+i+" "+"value is: "+ch);
		}
	}

}
