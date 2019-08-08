package assignment_24_7_19;
import java.util.Scanner;
class ArrayCheckElement{
	int elem;
	public ArrayCheckElement(int elem) {
		this.elem = elem;
	}
	public void findSum(int ... args) {
		boolean flag=false;
		for(int x:args) {
			if(elem == x) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}
}
public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int num = sc.nextInt();
		ArrayCheckElement obj = new ArrayCheckElement(num);
		obj.findSum(1,2,3,4,5,6,7,8,9,10);
	}
	
}
