package io;
import java.io.*;
class Student implements Serializable{
	int id; String name;
	int fee;
	public Student(int id,String name,int fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
}
public class Deserialization {

	public static void main(String[] args) {
		try {
			ObjectInputStream i=new ObjectInputStream(new FileInputStream("D://store.txt"));
			Student s=(Student)i.readObject();
			i.close();
			System.out.println("Id is: "+s.id+" "+"name is: "+" "+s.name+" "+"fees: "+s.fee);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
