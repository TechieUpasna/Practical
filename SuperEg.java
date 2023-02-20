package com.cognizant.shapes;
class Shape{//super class
	String name="Circle";
}
class Size extends Shape{  //derived class
	String name="No Size";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperEg { //main class

	public static void main(String[] args) { //main method
	Size obj= new Size();  //object
	obj.print();
	}

}
