package pattern;
interface Employee{
	void salary();
}
interface Development{
	void bonus();
}
class Trainer implements Employee,Development{
	@Override
	public void bonus() {
		System.out.println("Bonus");
	}
	
	@Override
	public void salary() {
		System.out.println("Salary");
	}
}
public class Multiple_interface {

	public static void main(String[] args) {
		Trainer t=new Trainer();
		t.bonus();
		t.salary();

	}

}

