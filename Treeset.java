package collection;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("w");
		ts.add("O");
		System.out.println("Set: "+ts);
		
		//traversing
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("Lowest value: "+ts.pollFirst());
			System.out.println("SEt: "+ts);
			System.out.println("Higest value: "+ts.pollLast());
		
		
		//to reverse the set
		System.out.println("Reverse set: "+ts.descendingIterator());
		System.out.println(ts);
		
		//sorted set operation
		System.out.println("Head set: "+ts.headSet("d"));
		System.out.println(ts);
		System.out.println("Sub set:"+ts.subSet("a", "c"));
		System.out.println("Tail set: "+ts.tailSet("c"));
	}


	}

}
