package assignment_24_7_19;

import java.util.Scanner;

class ArrayEquality{
	int []arr1,arr2;

	public ArrayEquality(int len) {
		super();
		this.arr1 = new int[len];
		this.arr2 = new int[len];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in First Array: ");
		for(int i=0;i<arr1.length;i++) {
				System.out.print("Enter value: ");
				arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter values in Second Array: ");
		for(int i=0;i<arr2.length;i++) {
				System.out.print("Enter value: ");
				arr2[i]=sc.nextInt();
		}
	}
	
	public void checkEqual() {
		boolean flag=true;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("Array's are equal");
		}
		else {
			System.out.println("Array's are not equal");
		}
	}
	
}
public class Question23 {

	public static void main(String[] args) {
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length: ");
		len = sc.nextInt();
		ArrayEquality obj = new ArrayEquality(len);
		obj.takeInput();
		obj.checkEqual();
	}

}
