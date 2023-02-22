package com.cognizant.shapes;

public class OverloadingTypePromotion {
	static void sum(int a,double b) {  //integer type arguments
		System.out.println(a+b);
	}
	static void sum(int a, int b) { //double type arguments
		System.out.println(a+b);
	}
		public static void main(String[] args) {
			OverloadingTypePromotion obj=new OverloadingTypePromotion();
			obj.sum(6, 9.20);
	obj.sum(10, 30);
		
	}

}
