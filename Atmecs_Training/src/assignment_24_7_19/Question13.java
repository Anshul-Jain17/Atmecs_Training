package assignment_24_7_19;
import java.util.Scanner;
class ArrayDuplicateString{
	String[] arr ;
	
	public ArrayDuplicateString(int length) {
		this.arr = new String[length];
	}
	
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i] = sc.nextLine();
		}
	}
	public void findDuplicate() {
		int cnt;
		for(int i=0;i<arr.length;i++) {
			cnt = 0;
			if(arr[i]==null) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					cnt++;
					arr[j]=null;
				}
			}
			System.out.println("there are "+cnt+" duplicates of "+arr[i]);
		}
	}
}
public class Question13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array lenght: ");
		int lenght = sc.nextInt();
		ArrayDuplicateString obj = new ArrayDuplicateString(lenght);
		obj.inputValue();
		obj.findDuplicate();
	}
}
