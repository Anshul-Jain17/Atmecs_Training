package assignment_24_7_19;
class ArrayMajorElement{
	int[] arr;

	public ArrayMajorElement(int[] arr) {
		this.arr = arr;
	}
	
	public void findMajorElement() {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			cnt=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
				}
			}
			if(cnt > arr.length/2) {
				System.out.println("Major Element: "+arr[i]);
			}
		}
	}
}
public class Question38 {
	public static void main(String[] args) {
		int[] arr= {11,11,11,11,5,11,13,5};
		ArrayMajorElement obj = new ArrayMajorElement(arr);
		obj.findMajorElement();
	}
}	
