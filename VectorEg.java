package collection;
import java.util.Vector;
public class VectorEg {

	public static void main(String[] args) {
		Vector<String> vc =new Vector<String>();  //vector created
		vc.add("Dog");
		vc.add("CAt");
		vc.add("Tiger");
		//checking size 
		System.out.println("Size: "+vc.size());
		
		//capacity
		System.out.println("Capacity: "+vc.capacity());
		
		//add more elements
		vc.addElement("Cow");
		vc.addElement("Goat");
		System.out.println("After add:-");
		//checking size 
		System.out.println("Size: "+vc.size());
				
		//capacity
		System.out.println("Capacity: "+vc.capacity());
				
		//checking whether a particular element present in the vector or not
				System.out.println(vc);
				if(vc.contains("CAt")) {
					System.out.println("Element present!");
				}
				else {
					System.out.println("Element not present");
				}
				
				//getting 1st element
				System.out.println("1st element: "+vc.firstElement());
				
				//getting last element
				System.out.println("last element: "+vc.lastElement());
				
				//checking index of specific element
				System.out.println("Index: "+vc.indexOf("Cow"));

	}

}
