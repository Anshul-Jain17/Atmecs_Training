package assignment_24_7_19;
import java.util.Arrays;
import java.util.Scanner;
class ArrayLongestSequence{
	int[] arr,newarr;
	public ArrayLongestSequence(int len) {
		this.arr = new int[len];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value: ");
			arr[i]= sc.nextInt();
		}
	}
	
	public void sort() {
		Arrays.sort(arr);
	}
	
	public void findLongestSequence() {
		sort();
		int cnt=1,len=0,k=0;
		int[] maxlen = new int[arr.length/2];
		for(int i=0;i<arr.length/2;i++) {
			for(int j=0;j<arr.length&&cnt<arr.length-1;j++) {
				if(((arr[cnt-1]) - arr[cnt]) == -1 ) {
					cnt++;
					len++;
				}
				else {
					maxlen[k++]=len+1;
					len=1;
					cnt=j+1;
				}
			}
		}
		maxlen[k++]=len+1;
		
		for(int i=1;i<maxlen.length;i++) {
			if(maxlen[0]<maxlen[i]) {
				int temp = maxlen[0];
				maxlen[0]=maxlen[i];
				maxlen[i]=temp;
			}
		}
		System.out.println("longest sequence length = "+(maxlen[0]));
	}
}
public class Question34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		ArrayLongestSequence obj = new ArrayLongestSequence(len);
		obj.takeInput();
		obj.findLongestSequence();
	}
}
