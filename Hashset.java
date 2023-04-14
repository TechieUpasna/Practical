package collection;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> s=new HashSet();
		s.add("Upasna");
		s.add("Aggarwal");
		s.add(null);
		System.out.println(s);
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
