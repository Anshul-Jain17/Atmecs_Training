package assignment_24_7_19;
class ArraySecondMinAndMin{
	int arr[];
	public ArraySecondMinAndMin(int[] arr) {
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
		System.out.println("Second minimum = "+arr[1]+" and Minimum = "+arr[0]);
	}
}
public class Question41 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,41,11,13,5};
		ArraySecondMinAndMin obj = new ArraySecondMinAndMin(arr);
		obj.findSecondMax();
	}
}
