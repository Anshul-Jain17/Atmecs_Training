package assignment_24_7_19;
import java.util.Scanner;
class ArrayElementIndex{
	int[] arr = {12,33,24,44,2,6};
	public void findIndex() {
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search: ");
		int elem = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==elem) {
				flag=true;
				System.out.println("found at index = "+i);
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
}
public class Question6 {
	public static void main(String[] args) {
		ArrayElementIndex obj = new ArrayElementIndex();
		obj.findIndex();
	}
}
