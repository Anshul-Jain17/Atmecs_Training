package assignment_23_7_19;
import java.util.Scanner;
class PositiveNegative {
	int val;
	public PositiveNegative(int val) {
		this.val = val;
	}
	
	public void checkPosNeg() {
		System.out.println((val>0)?"Positive":"Negative");
	}
}
public class Question1{
	public static void main(String[] args) {
		int val=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		val = sc.nextInt();
		PositiveNegative obj = new PositiveNegative(val);
		obj.checkPosNeg();
	}
}
