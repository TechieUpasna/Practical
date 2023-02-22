package com.cognizant.shapes;

public class OverloadingChangingArgs {  
static int sum(int a,int b) {   //2 parameters
return a+b;	
}
static int sum(int x,int y,int z,int c) {   //4 parameters
	return x+y+z+c;
}
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(5, 6));
		System.out.println(OverloadingChangingArgs.sum(2, 3,4,1));

	}

}
