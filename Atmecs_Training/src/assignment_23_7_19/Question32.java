package assignment_23_7_19;
import java.util.Scanner;
public class Question32 {
	public static void main(String[] args) {
		float num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		num1 = sc.nextFloat();
		System.out.println("Enter second value");
		num2 = sc.nextFloat();
		
		num1 = Math.abs(num1*100);
		num2 = Math.abs(num2*100);
		System.out.println((int)num1+" "+(int)num2);
		System.out.println(((int)num1==(int)num2)?"Same":"Not Same");
	}
}
