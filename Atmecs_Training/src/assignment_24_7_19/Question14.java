package assignment_24_7_19;
class ArrayCommonElementsString{
	String[] arr1,arr2;

	public ArrayCommonElementsString(String[] arr1, String[] arr2) {
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	public void findCommonElements() {
		for(int i=0;i<arr1.length;i++) {
			int cnt=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					cnt++;
				}
			}
			if(cnt>0) {
				System.out.println(arr1[i]+" a is common element");
			}
		}
	}
	
}
public class Question14 {
	public static void main(String[] args) {
		String[] arr1 = {"a","b","c"},arr2= {"a","b","a","a","b","c","d"};
		ArrayCommonElementsString obj = new ArrayCommonElementsString(arr1,arr2);
		obj.findCommonElements();
	}
}
