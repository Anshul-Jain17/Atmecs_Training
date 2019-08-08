package assignment_24_7_19;
import java.util.Scanner;
class ArrayCheckNegativeAndZero{
	int arr[];
	public ArrayCheckNegativeAndZero(int len) {
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
			if(arr[i]==0 || arr[i]==-1)
				flag=true;
		}
		if(flag) {
			System.out.println("Array contains 0 and -1");
		}
		else {
			System.out.println("Array does not contains 0 and -1");
		}
		
	}
}
public class Question30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		ArrayCheckNegativeAndZero obj = new ArrayCheckNegativeAndZero(len);
		obj.takeInput();
		obj.findZeroAndNegative();
	}
}
