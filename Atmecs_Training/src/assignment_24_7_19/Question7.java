package assignment_24_7_19;
import java.util.Scanner;
class ArrayElementDelete{
	int[] arr = {12,33,24,44,2,6};
	public void deleteElement() {
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to delete: ");
		int elem = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==elem) {
				for(int j=i+1;j<arr.length;j++) {
					arr[j-1]=arr[j];
				}
			}
		}
		
	}
	public void display() {
		for(int i=0;i<arr.length-2;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
public class Question7 {
	public static void main(String[] args) {
		ArrayElementDelete obj = new ArrayElementDelete();
		obj.deleteElement();
		obj.display();
	}
}
