package assignment_24_7_19;
import java.util.Scanner;
class ArrayMoveZero{
	int arr[];
	public ArrayMoveZero(int len) {
		this.arr = new int[len];
	}
	
	
	
	public void moveZeroToEnd() {
		int j=0,cnt=0;
		Scanner sc = new Scanner(System.in); 
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			int val = sc.nextInt();
			if(val!=0) {
				arr[j++] = val;
			}
			else {
				cnt++;
			}
		}
		for(int i=arr.length-1;i>arr.length-cnt;i--) {
			arr[i]=0;
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class Question26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		ArrayMoveZero obj = new ArrayMoveZero(len);
		obj.moveZeroToEnd();
		obj.display();
	}
}
