package com.cognizant.shapes;

public class Ghaziabadi {  //main method  
	public static void main(String[] args) {//main class
	Batchmember obj=new Batchmember(1,"Upasna",75000.00,123654789);//object	
obj.Show();
	}
}
class Batch{  //parent class
int id;
String name;
double fees;
Batch(int id,String name, double fees){
	this.id=id;
	this.name=name;
	this.fees=fees;
}}
class Batchmember extends Batch{  //child class
	long phone_no;
	Batchmember(int id, String name, double fees, long phone_no){
		super(id, name, fees);
		this.phone_no=phone_no;
	}
	void Show()
	{
		System.out.println(id+" "+name+" "+fees+" "+phone_no);
	}
}