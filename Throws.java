package exceptionHandling;
//checked exception 
import java.io.IOException;
class Test{
	void display() throws IOException{
		throw new IOException("Throw exception error");
	}
}
public class Throws {

	public static void main(String[] args) throws IOException {
		Test obj =new Test();
         obj.display();
	}

}
