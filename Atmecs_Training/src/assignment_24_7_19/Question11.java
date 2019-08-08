package assignment_24_7_19;
import java.util.Scanner;
class ArrayReverse{
	int[] arr ;
	
	public ArrayReverse(int length) {
		this.arr = new int[length];
	}
	
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i] = sc.nextInt();
		}
	}
	public void reverse() {
		for(int i=0,j=arr.length-1;i<=j;i++,j--) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array lenght: ");
		int lenght = sc.nextInt();
		ArrayReverse obj = new ArrayReverse(lenght);
		obj.inputValue();
		obj.reverse();
		obj.display();
	}
}
