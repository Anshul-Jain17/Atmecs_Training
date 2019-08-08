package assignment_24_7_19;
class ArrayAverage{
	int arr[];
	public ArrayAverage(int[] arr) {
		this.arr = arr;
	}
	
	public void sort() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public void calcAverage() {
		sort();
		for(int i=2;i<arr.length-1;i++) {
			arr[1] += arr[i]; 
		}
		System.out.println("average = "+(float)arr[1]/(arr.length-2));
	}
}
public class Question29 {
	public static void main(String[] args) {
		int[] arr= {11,12,13,141,5,11,13,5};
		ArrayAverage obj = new ArrayAverage(arr);
		obj.calcAverage();
	}
}
