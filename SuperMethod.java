package com.cognizant.shapes;
class Shape1{  //parent class
	void print() {  //parent class method
		System.out.println("Print circle");
	}
}
class Size1 extends Shape1{  //child class
	void print() {  
		System.out.println("Print triangle");
	}
	void display() {
		System.out.println("Print nothing");
	}
	void show() {
		super.print();
		display();
		print();
	}
}
public class SuperMethod {  //main class

	public static void main(String[] args) {  //main method
		Size1 object=new Size1();   //object
		object.show();  
	}

}
