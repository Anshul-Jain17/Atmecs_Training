package assignment_24_7_19;

class ArraySumPair1 {
	
	int arr[],sum;
	
	public ArraySumPair1(int[] arr, int sum) {
		this.arr = arr;
		this.sum = sum;
	}

	public void findPair(){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("pair: "+arr[i]+"+"+arr[j]);
				}
			}
		}
	}
}
public class Question35 {

	public static void main(String[] args) {
		int arr[] = {2,5,4,7,8,1};
		int sum = 12;
		ArraySumPair1 obj = new ArraySumPair1(arr,sum);
		obj.findPair();

	}

}
