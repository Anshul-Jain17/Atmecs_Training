package assignment_24_7_19;

class ArraySumTriplet{
	
	int arr[],sum;
	
	public ArraySumTriplet(int[] arr, int sum) {
		this.arr = arr;
		this.sum = sum;
	}

	public void findPair(){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println("pair: "+arr[i]+"+"+arr[j]+"+"+arr[k]);
					}
				}
			}
		}
	}
}
public class Question36 {

	public static void main(String[] args) {
		int arr[] = {2,5,4,7,8,1};
		int sum = 13;
		ArraySumTriplet obj = new ArraySumTriplet(arr,sum);
		obj.findPair();

	}

}
