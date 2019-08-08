package assignment_23_7_19;
import java.util.Scanner;
class FindMaxOfThree{
	int num1,num2,num3;

	public FindMaxOfThree(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void findMax() {
		if(num1>num2 ) {
			if(num1>num3)
				System.out.println(num1+" is greatest number");
			else
				System.out.println(num3+" is greatest number");
		}
		else if(num2>num3)
			System.out.println(num2+" is greatest number");
		else
			System.out.println(num3+" is greatest number");
	}
}
public class Question3 {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		num1 = sc.nextInt();
		System.out.println("Enter second value");
		num2 = sc.nextInt();
		System.out.println("Enter third value");
		num3 = sc.nextInt();
		FindMaxOfThree obj = new FindMaxOfThree(num1, num2, num3);
		obj.findMax();
	}
}
