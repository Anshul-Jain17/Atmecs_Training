package assignment_24_7_19;
class ArraySum{
	int sum;
	public void findSum(int ... args) {
		for(int x:args) {
			sum+=x;
		}
		System.out.println("sum = "+sum);
	}
}
public class Question2 {
	public static void main(String[] args) {
		ArraySum obj = new ArraySum();
		obj.findSum(1,2,3,4,5,6,7,8,9,10);
	}
	
}
