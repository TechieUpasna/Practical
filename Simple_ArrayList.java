package collection;
import java.util.ArrayList;
public class Simple_ArrayList {

	//array list allows duplicate values but LinkList not
	//array list also allows ordered insertion 
	public static void main(String[] args) {
	ArrayList<String> obj=new ArrayList<String>();  //creating ArrayList
	//add element in ArrayList through object
	obj.add("A");
	obj.add("B");
	obj.add("C");
	obj.add("E");
	obj.add("A");
	System.out.println(obj);  //printing array list
		
	}

}
