package assignment_24_7_19;

class ArraySumQuater{
	
	int arr[],sum;
	
	public ArraySumQuater(int[] arr, int sum) {
		this.arr = arr;
		this.sum = sum;
	}

	public void findPair(){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					for(int l=k+1;l<arr.length;l++) {
						if(arr[i]+arr[j]+arr[k]+arr[l]==sum) {
							System.out.println("pair: "+arr[i]+"+"+arr[j]+"+"+arr[k]+"+"+arr[l]);
						}
					}
				}
			}
		}
	}
}
public class Question43 {

	public static void main(String[] args) {
		int arr[] = {2,5,4,7,8,1};
		int sum = 18;
		ArraySumQuater obj = new ArraySumQuater(arr,sum);
		obj.findPair();

	}

}
