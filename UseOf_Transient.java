package io;
import java.io.Serializable;
import java.io.*;
//transient keyword is used with data member of class in order to avoid serialization
class Test implements Serializable{
	transient int id;       
	String name;
	public Test(int i, String n) {
		this.id=i;
		this.name=n;
	}
}
public class UseOf_Transient {

	public static void main(String[] args) throws Exception{
		Test obj=new Test(1,"Upasna");
		
		//serialization
		FileOutputStream f=new FileOutputStream("D://store.txt");
		ObjectOutputStream ob=new ObjectOutputStream(f);
		ob.writeObject(obj);
		ob.flush();
		ob.close();
		f.close();
		
		
		//desialization
		FileInputStream e=new FileInputStream("D://store.txt");
		ObjectInputStream in=new ObjectInputStream(e);
		Test obj1=(Test) in.readObject();
		System.out.println(obj1.id+" "+obj1.name);

	}

}
