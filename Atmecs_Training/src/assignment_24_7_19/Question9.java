package assignment_24_7_19;
import java.util.Scanner;
class ArrayElementInsert{
	int[] arr ;
	
	public ArrayElementInsert(int length) {
		this.arr = new int[length+1];
	}
	
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("Enter value: ");
			arr[i] = sc.nextInt();
		}
	}
	public void insertElement() {
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();
		System.out.println("Enter the element value: ");
		int elem = sc.nextInt();
		
		for(int i=arr.length-1;i>=pos-1;i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1]=elem;
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array lenght: ");
		int lenght = sc.nextInt();
		ArrayElementInsert obj = new ArrayElementInsert(lenght);
		obj.inputValue();
		obj.insertElement();
		obj.display();
	}
}
