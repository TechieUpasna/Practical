package collection;
import java.util.*;

//remove method combination
public class LinkedListRemoved {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  //first linked list
		ll.add("Arvind");
		ll.add("Sunita");
		ll.add("Upasna");
		ll.add("YAshika");
		System.out.println("List 1st elements: "+""+ll);
		
		//second linked list
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Naveen");
		ll2.add("Surbhi");
		ll2.add("Saurabh");
		System.out.println("List 2nd elements: "+""+ll2);
		
		//adding new element to the list1 
		System.out.println("After adding new elements: "+""+ll);
		
		//removing specific element from list 1
		ll.remove("Yashika");
		System.out.println("After removing: "+""+ll);
		
		//removing element from specific position
		ll.remove(2);
		System.out.println("After removing: "+""+ll);
		
		//removing all elements from the list
		ll.removeAll(ll2);
		System.out.println("After removing: "+""+ll);
		
		//removing 1st element of the list
		ll.removeFirst();
		System.out.println("After removing: "+""+ll);
		
		//removing last element of the list
		ll.removeLast();
		System.out.println("After removing: "+""+ll);
		
		//adding new elements into listt 1
		ll.add("Rakhi");
		ll.add("Vipin");
		ll.add("Mansi");
		ll.add("Falguni");
		System.out.println("After Updating: "+""+ll);
		
		
		//remove first occurrence of elements
		ll.removeFirstOccurrence("Upasna");
		System.out.println("After removing: "+""+ll);
		
		//removing last occurrence of the list
		ll.removeLastOccurrence(ll);
		System.out.println("After removing: "+""+ll);
		
		//Traversing the list of the elements in the reverse order
		Iterator i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//remove all the elements of the list
		ll.clear();
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
