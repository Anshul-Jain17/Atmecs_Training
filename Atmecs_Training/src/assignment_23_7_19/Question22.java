package assignment_23_7_19;
import java.util.Scanner;
public class Question22 {
	public static int findFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows to print: ");
		num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int k=1;k<=num-i-1;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(findFactorial(i)/(findFactorial(i-j)*findFactorial(j))+" ");
			}
			System.out.println();
		}
	}
}