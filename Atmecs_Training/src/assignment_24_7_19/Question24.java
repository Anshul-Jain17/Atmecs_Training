package assignment_24_7_19;
import java.util.Scanner;
class ArrayMissingElements{
	int lowerbound,upperbound,arr[];

	public ArrayMissingElements(int lowerbound, int upperbound, int length) {
		this.lowerbound = lowerbound;
		this.upperbound = upperbound;
		this.arr = new int[length];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public void findMissing() {
		for(int j=lowerbound;j<=upperbound;j++) {
			boolean flag=false;
			for(int i=0;i<arr.length;i++) {
				if(j==arr[i]) {
					flag=true;
				}
			}
			if(!flag) {
				System.out.println("Element missing: "+j);
			}
		}
		
	}
	
}
public class Question24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Lowerbound: ");
		int lowerbound = sc.nextInt();
		System.out.print("Enter the Upperbound: ");
		int upperbound = sc.nextInt();
		System.out.print("Enter the array length: ");
		int length = sc.nextInt();
		
		ArrayMissingElements obj = new ArrayMissingElements(lowerbound, upperbound, length);
		obj.takeInput();
		obj.findMissing();
	}

}
