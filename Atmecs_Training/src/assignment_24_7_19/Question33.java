package assignment_24_7_19;
import java.util.Scanner;
class ArrayNewLength{
	int[] arr,newarr;
	public ArrayNewLength(int len) {
		this.arr = new int[len];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i]= sc.nextInt();
		}
	}
	
	public void findNewLength() {
		int cnt=1;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[cnt++] = arr[i];
			}
		}
		arr[cnt++] = arr[arr.length-1];
		System.out.println("New Length = "+cnt);
	}
}
public class Question33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		ArrayNewLength obj = new ArrayNewLength(len);
		obj.takeInput();
		obj.findNewLength();
	}
}
