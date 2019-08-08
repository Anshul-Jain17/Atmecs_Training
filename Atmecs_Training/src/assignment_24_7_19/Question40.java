package assignment_24_7_19;
class ArrayMinSumPosAndNeg{
	int[] arr;

	public ArrayMinSumPosAndNeg(int[] arr) {
		this.arr = arr;
	}
	
	public void findSum() {
		int sum,p=0,n=1;
		int min_sum = arr[p]+arr[n];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum = arr[i]+arr[j];
				if(Math.abs(min_sum) > Math.abs(sum)) {
					min_sum=sum;
					p=i;
					n=j;
				}
			}
		}
		System.out.println("Those element whose sum is nearest to zero are "+arr[p]+" and "+arr[n]);
	}
}
public class Question40 {
	public static void main(String[] args) {
		int[] arr= {10,-9,14,-23,-15,0,9};
		ArrayMinSumPosAndNeg obj = new ArrayMinSumPosAndNeg(arr);
		obj.findSum();
	}
}	
