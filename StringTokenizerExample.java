package strings;
//need to import string tokenizer class
import java.util.StringTokenizer;

public class StringTokenizerExample {
public static void my() {
	StringTokenizer x=new StringTokenizer("Upasna Aggarwal pursuing java"," ");
	while(x.hasMoreTokens()) {  //boolean method it checks if there is more tokens available or not
		System.out.println (x.nextToken(" "));  //string method if return the next from string tokenizer
	}
	StringTokenizer y=new StringTokenizer("I am brilliant in nothing");
	while(y.hasMoreTokens()) {
		System.out.println(y.nextToken("&"));
	}
}
	public static void main(String[] args) {
		my();

	}

}
