package collection;
import java.util.*;

//user defined methods
public class Stack2 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		System.out.println("Stack"+s);
		
		//pushing elements using a user defined method
		pushingelement(s,15);
		pushingelement(s,25);
		pushingelement(s,35);
		pushingelement(s,45);
		
		//pop element
		popelement(s);
		popelement(s);
		
		//checking empty stack if yes throw exception
		try {
			popelement(s);
			
		}
		catch(EmptyStackException e) {
			System.out.println("Empty Stack");
		}
	}
	
	//push method
	private static void pushingelement(Stack<Integer> s,int i) {
		//invoke push() method
		s.push(new Integer(i));
		System.out.println("Push "+i);  //to print the value
		System.out.println("Stack: "+s);  //to print the whole stack
	}
	private static void popelement(Stack<Integer> s) {
		//invoke pop() method
		Integer i=(Integer)s.pop();
		System.out.println("Pop: "+i);
		System.out.println("Stack: "+s);
	}

}
