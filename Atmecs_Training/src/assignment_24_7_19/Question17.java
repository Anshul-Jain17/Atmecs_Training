package assignment_24_7_19;
class ArraySecondMax{
	int arr[];
	public ArraySecondMax(int[] arr) {
		this.arr = arr;
	}
	
	public void findSecondMax() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second maximum = "+arr[arr.length-2]);
	}
}
public class Question17 {
	public static void main(String[] args) {
		int[] arr= {11,12,13,141,5,11,13,5};
		ArraySecondMax obj = new ArraySecondMax(arr);
		obj.findSecondMax();
	}
}
