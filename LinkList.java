package collection;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  //created a list
		ll.add("Naveen");
		ll.add("Bobby");
		ll.add("Vipin");
		ll.add("Upasna");
		ll.add("surbhi");
		System.out.println(ll);
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//adding an element at the specific position
		ll.add(2,"Mamta");  //adding an element on index 2
		System.out.println("Adding after: "+" "+ll);
		
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Yashika");
		ll2.add("Falguni");
		System.out.println("List 2 elements: "+" "+ll2);
		//adding all 2nd list elements to be 1st list
		ll.addAll(ll2);
		System.out.println("Adding all elements of list 2 at specific position: "+" "+ll);
		//adding element at the 1st position
		ll2.addFirst("Aggarwals");
		System.out.println("Add elements at 1st:"+" "+ll2);
		//adding elements at the last position
		ll2.addLast("Seema");
		System.out.println("Add elements at last: "+" "+ll2);

	}

}
