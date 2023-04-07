package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListUsing_Iterator {

	
	//iterator is an interface
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Upasna");
		obj.add("Aggarwal");
		obj.add("Learning");
		obj.add("java");

		//using for loop
		System.out.println("Traversing using for loop:-");
		for(int i=0;i<obj.size();i++) {
			System.out.print(obj.get(i)+" ");
		}
		System.out.println("\n");
		
		//using for each loop
		System.out.println("Traversing using for each loop:-");
		for(String a:obj) {
			System.out.print(a+" ");
		}
		
		System.out.println("\n");
		
		//using iterator
		System.out.println("Traversing using iterator:-");
		//by default iterator works forwardly 
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		
		//using forward iterator
		System.out.println("Traversing using forward iterator");
		ListIterator<String> i1=obj.listIterator();
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
		}
		System.out.println("\n");
		//using backward iterator
		System.out.println("Traversing using backward iterator:");
		ListIterator<String> i2=obj.listIterator(obj.size());
		while(i2.hasPrevious()) {
			System.out.print(i2.previous()+" ");
		}
		
		System.out.println("\n");
		//foreach() method
		System.out.println("Traversing using foreach method:-");
		obj.forEach(a->System.out.print(a+" "));
	}

}
