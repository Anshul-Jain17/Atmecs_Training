package assignment_24_7_19;

class ArrayRotationCount{
	
	int arr[];
	
	public ArrayRotationCount(int[] arr) {
		this.arr = arr;
	}

	public void findRotationCount(){
		int index=0,min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				index=i;
			}
		}
		System.out.println("Rotation Count = "+(arr.length-index));
	}
}
public class Question47 {

	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		ArrayRotationCount obj = new ArrayRotationCount(arr);
		obj.findRotationCount();

	}

}
