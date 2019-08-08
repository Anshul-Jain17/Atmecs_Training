package assignment_24_7_19;
import java.util.Scanner;
class ArrayCopy{
	int[] arr,arrcpy;

	public ArrayCopy(int arrlen) {
		super();
		this.arr = new int[arrlen];
		this.arrcpy = new int[arrlen];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the value: ");
			arr[i] = sc.nextInt();
		}
	}
	
	public void arrayCopy() {
		for(int i=0;i<arr.length;i++) {
			arrcpy[i] = arr[i];
		}
	}
	
	public void display() {
		System.out.println("Array\tCopy");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t"+arrcpy[i]);
		}
	}
}
public class Question8 {
	public static void main(String[] args) {
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		len = sc.nextInt();
		ArrayCopy obj = new ArrayCopy(len);
		obj.takeInput();
		obj.arrayCopy();
		obj.display();
	}	
}
