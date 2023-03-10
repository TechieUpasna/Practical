package homeAssignment;

public class ClonningArray {

	public static void main(String[] args) {
		int[] a= {9,5,4,0,6,777,5,7};
		System.out.println("Print the actual array");
		for(int i:a) {  
			System.out.print(i+" ");
		}
		System.out.println("\nPrint the clone array");
		int b[]=a.clone();//creating clone
		for(int i:b) {//for each loop for cloning array
			System.out.print(i+" ");
		}
		System.out.println("\nBoth are equal?");
		System.out.println(a==b);//checking
	}

}
