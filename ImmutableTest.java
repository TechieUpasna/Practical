package strings;

public class ImmutableTest {

	public static void main(String[] args) {
		String str="Upasna";
		System.out.println(str);   //here it will use only Upasna
		str=str.concat(" Aggarwal");  //adding another string in the end
		System.out.println(str);  //but now here str is updated so it'll show upasna aggarwal

	}

}
