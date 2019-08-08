package assignment_24_7_19;
class ArrayManageZeroAndOne{
	int arr[],cnt,index;
	public ArrayManageZeroAndOne(int[] arr) {
		this.arr = arr;
	}
	
	public void iterate() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				cnt++;
			}
		}
	}
	public void generateArray() {
		for(int i=0;i<cnt;i++) {
			arr[i]=0;
			index=i;
		}
		for(int i=index+1;i<arr.length;i++) {
			arr[i]=1;
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class Question42 {
	public static void main(String[] args) {
		int[] arr= {1,0,0,0,1,1,0};
		ArrayManageZeroAndOne obj = new ArrayManageZeroAndOne(arr);
		obj.iterate();
		obj.generateArray();
		obj.display();
	}
}
