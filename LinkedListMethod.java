package collection;

//pop return an exception on an empty list
//poll return null on an empty list 
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListMethod {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Upasna");
		ll.add("Chikki");
		ll.add("Aggarwals");
		System.out.println("List 1 elements: "+" "+ll);
		
		//retrieves the 1st elements of the list--- by default
		System.out.println("retrieves the 1st elements: "+ll.peek());
		
		//retrieves the 1st element of the list
		System.out.println("retrieves the 1st elements: "+ll.peekFirst());
		
		//retrieves the last element of the list
		System.out.println("retrieves the last element"+ll.peekLast());
		
		System.out.println(ll.pop());
		System.out.println("List 1 element:"+""+ll);
		
		
		//pop return an exception on an empty list
		//retrieve and remove the 1st element of the list ----by default 
		System.out.println("poll: "+ll.poll());
		System.out.println("List 1 elemets: "+""+ll);
		
		//retrieves and remove the 1st element of the list
		System.out.println("retrieves and remove the 1st element: "+ll.pollFirst());
		System.out.println(ll);
		
		//retrieves and remove the last element of the list
		System.out.println("retrieves and remove the last element: "+ll.pollLast());
		System.out.println("List 1 element:"+""+ll);
		
		
		//
//		System.out.println(ll.pop());
//		System.out.println("List 1 element:"+""+ll);

	}

}
