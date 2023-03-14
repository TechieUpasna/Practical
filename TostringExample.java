package strings;
//toString() is used to a string object
public class TostringExample {
	int rollNo;
	String name,address;
	TostringExample(int rollNo, String name, String address){
	this.rollNo=rollNo;
	this.name=name;
	this.address=address;
	}
	//if we don't write tostring then it will give hashcode not a proper string
	public String toString() {  //return object to string
		return rollNo+" "+name+" "+address;}
	
	public static void main(String[] args) {
	TostringExample a=new TostringExample(1,"Aman","Kashmir");
	TostringExample b=new TostringExample(2,"Bobby","Kerela");
		System.out.println(a);
		System.out.println(b);

	}

}
