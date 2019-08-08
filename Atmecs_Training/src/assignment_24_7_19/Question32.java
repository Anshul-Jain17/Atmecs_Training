package assignment_24_7_19;
import java.util.Scanner;
class ArrayCheckSpecificNumbers{
	int arr[];
	public ArrayCheckSpecificNumbers(int len) {
		this.arr = new int[len];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i]= sc.nextInt();
		}
	}
	
	public void findZeroAndNegative() {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==65 || arr[i]==77)
				flag=true;
		}
		if(flag) {
			System.out.println("Array contains specific numbers");
		}
		else {
			System.out.println("Array does not specific numbers");
		}
		
	}
}
public class Question32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		ArrayCheckSpecificNumbers obj = new ArrayCheckSpecificNumbers(len);
		obj.takeInput();
		obj.findZeroAndNegative();
	}
}
