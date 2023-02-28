package pattern;
interface Parent{
	void show();
}
interface child extends Parent{
	void display();
}
class Child1 implements child{
	@Override
	public void show() {
		System.out.println("Parent interface method");
	}
	@Override
	public void display() {
		System.out.println("Child interface method");
	}
}
public interface Inheritance {
	public static void main(String arg[]) {
		Child1 obj=new Child1();
		obj.display();
		obj.show();
	}

}
