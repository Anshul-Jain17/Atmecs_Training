package assignment_23_7_19;
import java.util.Scanner;
public class Question30 {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		num1 = sc.nextInt();
		System.out.println("Enter second value");
		num2 = sc.nextInt();
		System.out.println("Enter third value");
		num3 = sc.nextInt();
		if(num1 == num2 && num2==num3 && num1==num3) {
			System.out.println("All numbers are equal");
		}
		else if(num1 != num2 && num2 != num3 && num1!=num3) {
			System.out.println("All numbers are different");
		}
		else {
			System.out.println("Neither all are equal nor different");
		}
	}
}
