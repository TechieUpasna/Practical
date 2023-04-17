package collection;
import java.util.*;

//does not allows null values
public class Tree_Map {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(101,"Mango");
//		t.put(null, "123");
//		t.put(52, null);
		t.put(502, "Hii");
		System.out.println(t);
		t.putIfAbsent(102, "Something");
		t.putIfAbsent(105, "Nothing");
		System.out.println("-----------------------------------------------------");
		for(Map.Entry m:t.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		t.remove(101);
		System.out.println("-----------------------------------------------------");
		System.out.println("After Removal");
		for(Map.Entry m: t.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
