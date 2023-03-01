package mypackage;

public class Encapsulated {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setAc_no(1478523699874563L);
		b.setAmount(50000.25F);
		b.setEmail("Upasnaaggarwal09@gmail.com");
		b.setName("Upasna");
		System.out.println(b.getAc_no()+" "+b.getAmount()+" "+b.getEmail()+" "+b.getName());
	}

}
