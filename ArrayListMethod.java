package collection;
import java.util.*;
public class ArrayListMethod {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();
		obj.add("Ram");
		obj.add("Sam");
		obj.add("Rose");
		obj.add("Liza");
		obj.add("David");
		obj.add("Maria");
		String element =obj.get(2);
		System.out.println("Get index: "+element);
		System.out.println("Array list is: "+obj.isEmpty());
		String element1=obj.remove(4);
		System.out.println("Remove index: "+element1);
		System.out.println("Traversing using for loop");
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
	}

}
