package collection;
import java.util.*;
public class Linked_HashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer, String>();
		l.put(101, "A");
		l.put(102, "B");
		l.put(null, null);
		l.put(null, "Shit");
		for(Map.Entry m: l.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("---------------------------------------------------------");
		l.putIfAbsent(105, "Mice");
		l.putIfAbsent(102, "Nice");
		for(Map.Entry m: l.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//key
		System.out.println("Keys: "+l.keySet());
		
		//value
		System.out.println("Values"+l.values());
		
		//key=value
		System.out.println("Keys and values: "+l.entrySet());
		
		l.remove(null);
		System.out.println("After removal:");
		for(Map.Entry m:l.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
