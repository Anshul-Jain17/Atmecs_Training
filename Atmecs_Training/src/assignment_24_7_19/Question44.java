package assignment_24_7_19;

class PossibleTriangles{
	
	int arr[],sum;
	
	public PossibleTriangles(int[] arr, int sum) {
		this.arr = arr;
		this.sum = sum;
	}

	public void findPair(){
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]>arr[k] && arr[j]+arr[k]>arr[i] && arr[i]+arr[k]>arr[j] ) {
						cnt++;
					}
				}
			}
		}
		System.out.println("Total No of possible triangles are "+cnt);
	}
}
public class Question44 {

	public static void main(String[] args) {
		int arr[] = {2,5,4,7,8,1};
		int sum = 13;
		PossibleTriangles obj = new PossibleTriangles(arr,sum);
		obj.findPair();

	}

}
