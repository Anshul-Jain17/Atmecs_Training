package assignment_24_7_19;
import java.util.Scanner;
class ArrayTensSum{
	int arr[];
	public ArrayTensSum(int len) {
		this.arr = new int[len];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i]= sc.nextInt();
		}
	}
	
	public void findSum() {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10)
				cnt++;
		}
		if(cnt*10 == 30)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
public class Question31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		ArrayTensSum obj = new ArrayTensSum(len);
		obj.takeInput();
		obj.findSum();
	}
}
