package assignment_24_7_19;
class ArrayRemoveDuplicate{
	int[] arr;

	public ArrayRemoveDuplicate(int[] arr) {
		this.arr = arr;
	}
	
	public void findDuplicate() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]='0';
				}
			}
		}
	}
	
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='0') {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
public class Question16 {
	public static void main(String[] args) {
		int[] arr= {11,0,0,141,5,11,13,5};
		ArrayRemoveDuplicate obj = new ArrayRemoveDuplicate(arr);
		obj.findDuplicate();
		obj.display();
	}
}	
