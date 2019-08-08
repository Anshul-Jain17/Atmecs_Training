package assignment_24_7_19;

import java.util.Arrays;

class ArraySort{
	
	int arr[];
	
	public ArraySort(int[] arr) {
		this.arr = arr;
	}

	public void sortAndArrange(){
		Arrays.sort(arr);
		int index=0;
		for(int i=0;i<arr.length/2;i++) {
			int k=arr[arr.length-1];
			for(int j=arr.length-1;j>index;j--) {
				arr[j] = arr[j-1];
			}
			arr[index] = k;
			index+=2;
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class Question50 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		ArraySort obj = new ArraySort(arr);
		obj.sortAndArrange();
		obj.display();
	}

}
