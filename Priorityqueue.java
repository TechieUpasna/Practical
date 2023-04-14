package collection;
import java.util.*;

//FIFO
//highest priority is according the alphabetical order which alphabetic comes first will have highest priority

public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("Upasna");
		p.add("Is");
		p.add("Learning");
		p.add("Java");
		
		//to show the highest priority
		System.out.println("Head: "+p.element());
		System.out.println("Queue: "+p);
		
		//to shows the first element of the queue
		System.out.println("Head: "+p.peek());
		System.out.println("Queue: "+p);
		
		//iteration of queue
		Iterator itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Head: "+p.poll());
		System.out.println("Queue: "+p);
		
		//to remove
		System.out.println("Head: "+p.remove());
		System.out.println("Queue: "+p);
		System.out.println("After removing the queue: ");
		Iterator<String>itr1=p.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
