package assignment_24_7_19;

class ArrayNegativePositive{
	
	int arr[];
	
	public ArrayNegativePositive(int[] arr) {
		this.arr = arr;
	}

	public void generateArray(){
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<0) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			else {
				continue;
			}
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class Question48 {

	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2,-6,-7,-2};
		ArrayNegativePositive obj = new ArrayNegativePositive(arr);
		obj.generateArray();
		obj.display();
	}

}
