package assignment_23_7_19;
import java.util.Scanner;
class DecimalPoint{
	float num1,num2;

	public DecimalPoint(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void checkNumber() {
		num1 = Math.abs(num1*1000);
		num2 = Math.abs(num2*1000);
		System.out.println(((int)num1==(int)num2)?"Same":"Not Same");
	}
}
public class Question6 {
	public static void main(String[] args) {
		float num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		num1 = sc.nextFloat();
		System.out.println("Enter second value");
		num2 = sc.nextFloat();
		DecimalPoint obj = new DecimalPoint(num1, num2);
		obj.checkNumber();
	}
}
