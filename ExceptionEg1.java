package exceptionHandling;

public class ExceptionEg1 {

	
	
	//Checked Exception/or Compile time errors: i/o exception 
	  //eg- int n; n="String"   this kind of mistake is compile time error
	
	//unchecked/ Runtime exception: Arithmetic,Arrayindexoutofbound,number frmat, null pointer, input mismatch
	
	
	
	//try and catch
	
	public void display() {//method
		String a="i am error";
		System.out.println(a);
		try {
			int i=50/0;   //arithmetic exception
			System.out.println(i);
			
			//it will not execute these lines as once the compiler move toward catch then it will not move backwards
			String b="Upasna";
			System.out.println(b.length());
		}
		
		//catch block
		catch(Exception e){
			System.out.println("exception");
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ExceptionEg1 obj=new ExceptionEg1();
		obj.display();
	}

}
