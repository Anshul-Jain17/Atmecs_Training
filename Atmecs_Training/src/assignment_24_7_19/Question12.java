package assignment_24_7_19;
import java.util.Scanner;
class ArrayDuplicateInteger{
	int[] arr ;
	
	public ArrayDuplicateInteger(int length) {
		this.arr = new int[length];
	}
	
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i] = sc.nextInt();
		}
	}
	public void findDuplicate() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print("duplicate elements: "+arr[i]);	
				}
			}
		}
	}
}
public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array lenght: ");
		int lenght = sc.nextInt();
		ArrayDuplicateInteger obj = new ArrayDuplicateInteger(lenght);
		obj.inputValue();
		obj.findDuplicate();
	}
}
