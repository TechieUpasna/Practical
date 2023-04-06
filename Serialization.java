package io;
import java.io.*;
import java.io.Serializable;

//serialization: writing state of an object into byte stream 
//deserialization: is opposite of serialization


//converting object into byte stream
class Student implements Serializable{
	int id;
	String name;
 int fee; 
 public Student(int id, String name, int fee) {
	 this.id=id;
	 this.name=name;
	 this.fee=fee;
 }
}
public class Serialization {

	public static void main(String[] args) {
		try {
			Student s=new Student(101,"Upasna",2500);
			FileOutputStream out=new FileOutputStream("D://store.txt");//to write
			ObjectOutputStream obj=new ObjectOutputStream(out); //for serialization
			obj.writeObject(s);  //converting object into a byte stream
			obj.close();
			System.out.println("Done!");
					
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
