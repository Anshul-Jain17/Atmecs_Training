package assignment_24_7_19;
class ArrayMinMaxDifference{
	int arr[];
	public ArrayMinMaxDifference(int[] arr) {
		this.arr = arr;
	}
	
	public void findMinMaxDiffernce() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Differnce between Maximum and Minimum of array: "+(arr[arr.length-1]-arr[0]));
	}
}
public class Question28 {
	public static void main(String[] args) {
		int[] arr= {11,12,13,141,5,11,13,5};
		ArrayMinMaxDifference obj = new ArrayMinMaxDifference(arr);
		obj.findMinMaxDiffernce();
	}
}
