package exceptionHandling;


//constructor can throw exception
public class ThrowWithConstructor {
String name;
int age;
public ThrowWithConstructor(String name, int age)throws Exception{
	if(age<18) {
		throw new Exception("age should be more than 18");
	}
	this.name=name;
	this.age=age;
}
	public static void main(String[] args) throws Exception {
		ThrowWithConstructor obj=new ThrowWithConstructor("Upasna",20);
System.out.println(obj.name+" "+obj.age);
	}

}
