package assignment_24_7_19;
class ThreeArrayCommonElements{
	int[] arr1,arr2,arr3;
	
	public ThreeArrayCommonElements(int[] arr1,int []arr2, int []arr3) {
		this.arr1 = arr1;
		this.arr2 = arr2;
		this.arr3 = arr3;
	}
	
	public void findCommonElement() {
		for(int i=0;i<arr1.length&&i<arr2.length&&i<arr3.length;i++) {
			if(arr1[i]==arr2[i] && arr2[i]==arr3[i]) {
				System.out.println("Common Element: "+arr1[i]);
			}
		}
	}
}
public class Question25 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4,12,33,15,54};
		int[] arr3 = {1,2,3};
		
		ThreeArrayCommonElements obj = new ThreeArrayCommonElements(arr1, arr2, arr3);
		obj.findCommonElement();
	}
}
