package collection;
import java.util.*;

//double ended queue
//LIFO as well as FIFO
//Interface queue---- used as stack as well as queue


//array dequeue --- it does not accept null values

public class Dequeue {

	public static void main(String[] args) {
		Deque<String>d=new ArrayDeque<String>();
		d.add("AA");
		d.add("BB");
		d.add("CC");
		d.add("DD");
		System.out.println(d);
		
		//to add at first position
		System.out.println("add at First position: " );
		d.addFirst("Upasna");
		System.out.println(d);
		
		//to add at last position
		System.out.println("Add at last position: ");
		d.addLast("Aggarwal");
		System.out.println(d);
		
		//to print dequeue
		for(String a: d) {
			System.out.println(a);
		}
		
		//to remove first element
		d.removeFirst();
		
		//to remove last element
		d.removeLast();
		
		
		System.out.println("New list after updation: ");
		for(String b:d) {
			System.out.println(b);
		}

	}

}
