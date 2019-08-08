package assignment_24_7_19;

import java.util.Arrays;

class ArrayNextGreatestElement{
	
	int arr[];
	
	public ArrayNextGreatestElement(int[] arr) {
		this.arr = arr;
	}

	public void Arrange(){
		int index=0;
		for(int i=0;i<arr.length;i++) {
			int k=arr[arr.length-1];
			
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class Question53 {
	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		ArrayNextGreatestElement obj = new ArrayNextGreatestElement(arr);
		obj.Arrange();
		obj.display();
	}

}
