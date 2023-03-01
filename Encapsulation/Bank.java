package mypackage;

public class Bank {
private long Ac_no;
private String name,email;
private float amount;

	public long getAc_no() {
	return Ac_no;
}
public void setAc_no(long ac_no) {
	Ac_no = ac_no;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public float getAmount() {
	return amount;
}

public void setAmount(float amount) {
	this.amount = amount;
}


}
