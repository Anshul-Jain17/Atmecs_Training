package assignment_23_7_19;
import java.util.Scanner;
public class Question15 {
	public static void main(String[] args) {
		int n=0,sum=0,j=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values to print: ");
		n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.println(j);
			sum+=j;
			j+=2;
		}
		System.out.println("sum = "+sum);
	}
}
