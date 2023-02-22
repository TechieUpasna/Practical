package com.cognizant.shapes;

public class Overloading_Changing_ArgDatatype {
static int sum(int a,int b) {  //integer type arguments
	return a+b;
}
static double sum(double a, double b) { //double type arguments
	return a+b;
}
	public static void main(String[] args) {
		System.out.println(Overloading_Changing_ArgDatatype.sum(5, 6));
System.out.println(Overloading_Changing_ArgDatatype.sum(2, 6.01));
	}

}
