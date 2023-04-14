package collection;
import java.util.*;
//Set in:-
//unordered collection
//unique element


//hash set:-
//maintain insertion order

//tree set
//maintain ascending order
//does not allow null value

//hash set example
public class Setin {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("AC");
		s.add("Pen");
		s.add("Book");
		s.add(null);
		s.add("Somthing");
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
