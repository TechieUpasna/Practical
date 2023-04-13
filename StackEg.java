package collection;
import java.util.*;

//LIFO
public class StackEg {

	public static void main(String[] args) {
		//creating a stack
		Stack<Integer> s=new Stack<>();
		
		//to check whether stack is empty or not
		boolean result=s.isEmpty();
		System.out.println("Is stack empty? "+result);
		
		
		//adding element PUSH
		s.push(25);
		s.push(35);
		s.push(40);
		s.push(55);
		s.push(80);
		s.push(75);
		
		//to add an element at any particular position
		s.add(5, 456);
		
		System.out.println("Stack element: "+s); //shows result
		
		//to show top element
		Integer digit=s.peek();
		System.out.println("Top element: "+digit);
		System.out.println("Stack element after peek: "+s);
		
		//to remove top element
		Integer digit2 =s.pop();
		System.out.println("Top element: "+digit2);
		System.out.println("Stack element"+s);
		
		//to search any particular element
		int d=s.search(35);
		System.out.println("Element is at "+d+" Position");
		
		//find size of stack
		int x=s.size();
		System.out.println("Size of the stack is: "+x);
		
		
		
		

	}

}
