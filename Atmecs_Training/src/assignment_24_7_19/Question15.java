package assignment_24_7_19;
class ArrayCommonElementsInteger{
	int[] arr1,arr2;

	public ArrayCommonElementsInteger(int[] arr1, int[] arr2) {
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	public void findCommonElements() {
		for(int i=0;i<arr1.length;i++) {
			int cnt=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					cnt++;
				}
			}
			if(cnt>0) {
				System.out.println(arr1[i]+" a is common element");
			}
		}
	}
	
}
public class Question15 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6},arr2= {2,3,2,4,1,9,70};
		ArrayCommonElementsInteger obj = new ArrayCommonElementsInteger(arr1,arr2);
		obj.findCommonElements();
	}
}
