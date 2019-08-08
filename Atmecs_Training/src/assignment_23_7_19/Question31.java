package assignment_23_7_19;
import java.util.Scanner;
public class Question31 {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		num1 = sc.nextInt();
		System.out.println("Enter second value");
		num2 = sc.nextInt();
		System.out.println("Enter third value");
		num3 = sc.nextInt();
		if(num1<num2 && num2<num3 ) {
			System.out.println("increasing");
		}
		else if(num1 > num2 && num2 > num3 ) {
			System.out.println("decreasing");
		}
		else {
			System.out.println("Neither increasing nor decreasing order");
		}
	}
}
