package com.cognizant.shapes;
class Shape2{  //super class
	Shape2(){
		System.out.println("Hello");
	}
}
class Size2 extends Shape2{  //sub class
	Size2(){
		super();
		System.out.println("Bye");
	}
}
public class SuperCon {  //main class

	public static void main(String[] args) {  //main method
		Size2 obj =new Size2();  //object

	}

}
