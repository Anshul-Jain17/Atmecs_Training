package assignment_24_7_19;
import java.util.Scanner;
class ArrayOddEven{
	int arr[];
	public ArrayOddEven(int len) {
		this.arr = new int[len];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i]= sc.nextInt();
		}
	}
	
	public void findEvenOdd() {
		int odd=0,even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even Elements: "+even+" Odd Elements: "+odd);
	}
}
public class Question27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		ArrayOddEven obj = new ArrayOddEven(len);
		obj.takeInput();
		obj.findEvenOdd();
	}
}
