package collection;
import java.util.*;

//use of offer first & offer last
public class ArrayDequeue {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Upasna");
		dq.add("Mansi");
		dq.add("Something");
		dq.add("Shakira");
		
		
		//offerFirst
		dq.offerFirst("Yo!!");
		System.out.println(dq);
		
		//offerLast
		dq.offerLast("Marr gya!");
		System.out.println(dq);
		
		//traversing
		for(String a: dq) {
			System.out.println(a);
		}
		
		//to show the elements of Dequeue
		System.out.println("First element"+dq.peek());  //by default
		
		System.out.println("first element: "+dq.peekFirst()); //first element
		
		System.out.println("Last element: "+dq.peekLast());  //last element
		
		System.out.println("After peek:-");
		for(String b: dq) {
			System.out.println(dq);
		}
		
		
		//to remove
		System.out.println("Remove first element: "+dq.remove());  //by default
		
		System.out.println("Remove first element: "+dq.removeFirst());
		
		System.out.println("Remove last element: "+dq.removeLast());
		System.out.println("After removing:-");
		for(String c: dq){
			System.out.println(c);
		}
		
		

	}

}
