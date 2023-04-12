package collection;
import java.util.*;
public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Upasna");
		ll.add("Aggarwal");
		System.out.println("After adding: "+ll );
		
		//adding an element at specific position
		ll.add(2, "Java");
		System.out.println(ll);
		
		LinkedList<String> lll=new LinkedList<String>();
		lll.add("AA");
		lll.add("AB");
		System.out.println(lll);
		
		//adding 2nd list elements to 1st list
		ll.addAll(lll);
		System.out.println(ll);
		
		//adding 2nd list to list 1 at specific position
		ll.addAll(2,lll);
		System.out.println(ll);
		
		
		//adding an element at first position
		ll.addFirst("hiii...");
		System.out.println(ll);
		
		//adding an element at last of list
		ll.addLast("Success");
		System.out.println(ll);
		
		
		//removing specific element from the list
		ll.remove("Java");
		System.out.println(ll);
	

	}

}
