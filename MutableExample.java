package strings;
//stringBuffer  and stringBuilder
public class MutableExample {
//append()  insert() replace()   delete() reverse() 
	public static void main(String[] args) {
		
	//stringBuffer
		StringBuffer a=new StringBuffer("Hello");  //stringBuffer object
		System.out.println("append: "+a.append("World"));  //just like concatenation
		System.out.println("insert(): "+a.insert(2,"Upasna"));  //insert from 2nd index
		System.out.println("Replace(): "+a.replace(1, 3, "Java"));  //begin from, ends with and string that to be inserted
		
		
	//stringBuilder
		StringBuilder b=new StringBuilder("World");
		System.out.println("Replace(): "+b.replace(1, 3, "java"));  //begin from, ends with and the string
		System.out.println("delete: "+b.delete(1, 3));  //begins from and ends with
		System.out.println("reverse: "+b.reverse());  //reverse

	}

}
