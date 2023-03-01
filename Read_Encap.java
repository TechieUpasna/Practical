package mypackage;

public class Read_Encap {
//we can read only (only getter method)
	private String name="Upasna";
	public String getName() {
		return name;}
	public static void main(String[] args) {
	Read_Encap obj =new Read_Encap();
	//obj.set_name("Kuch bhi"); to change the value of name
	System.out.println(obj.name);
	}

}
