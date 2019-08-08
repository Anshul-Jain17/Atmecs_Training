package assignment_24_7_19;
import java.util.Scanner;
class ArrayMinMax{
	int[] arr ;
	
	public ArrayMinMax(int length) {
		this.arr = new int[length];
	}
	
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i] = sc.nextInt();
		}
	}
	public void findMinMax() {
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum = "+min+" Maximum "+max);
	}
	
}
public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array lenght: ");
		int lenght = sc.nextInt();
		ArrayMinMax obj = new ArrayMinMax(lenght);
		obj.inputValue();
		obj.findMinMax();
	}
}
