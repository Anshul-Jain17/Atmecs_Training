package assignment_24_7_19;
class ArrayAvg{
	int sum;
	public void findSum(int ... args) {
		for(int x:args) {
			sum+=x;
		}
		System.out.println("avg = "+(float)sum/args.length);
	}
}
public class Question4 {
	public static void main(String[] args) {
		ArrayAvg obj = new ArrayAvg();
		obj.findSum(1,2,3,4,5,6,7,8,9,10);
	}
	
}
