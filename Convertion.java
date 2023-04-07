package collection;
import java.util.*;
public class Convertion {

	public static void main(String[] args) {
		ArrayList <String> obj=new ArrayList<String>();
		obj.add("Rose");
		obj.add("Lily");
		obj.add("Tulip");
		
		//converting list to array
		System.out.println("List to array");
		String[] arr=obj.toArray(new String[obj.size()]);
		for(String s: arr) {
			System.out.println(s);
		}
		//array to list
		System.out.println("array to list");
		List<String> all =new ArrayList<String>();
		all=Arrays.asList(arr);  //converting array to list
		System.out.println(all);
	
	}

}
