package assignment_24_7_19;
class ArrayLeader{
	int[] arr;

	public ArrayLeader(int[] arr) {
		this.arr = arr;
	}
	
	public void findLeaderElement() {
		boolean cnt=false;
		for(int i=0;i<arr.length;i++) {
			cnt=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					cnt = false;
				}
			}
			if(!cnt) {
				System.out.println("Leader Element: "+arr[i]);
			}
		}
	}
}
public class Question39 {
	public static void main(String[] args) {
		int[] arr= {10,9,14,23,15,0,9};
		ArrayLeader obj = new ArrayLeader(arr);
		obj.findLeaderElement();
	}
}	
