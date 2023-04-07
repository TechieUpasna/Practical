package collection;
import java.util.*;
class Bank{
	int no,age;
	String name;
	public Bank(int no,String name,int age) {
		this.no=no;
		this.name=name;
		this.age=age;
	}
}
public class UserDefined_ArrayList {

	public static void main(String[] args) {
		Bank b=new Bank(1,"Riya",25);
		Bank b1=new Bank(2,"tia",29);
		Bank b2=new Bank(3,"siya",21);
		
		ArrayList<Bank> obj=new ArrayList<Bank>();
		obj.add(b);
		obj.add(b1);
		obj.add(b2);
		
		
		//main logic
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			Bank object=(Bank) i.next();
			System.out.println(object.no+" "+object.name+" "+object.age);
		}

	}

}
