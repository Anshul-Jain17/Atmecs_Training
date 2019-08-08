package assignment_23_7_19;
import java.util.Scanner;
class SumAndAverage{
	public void getSumAndAverage() {
		int sum=0,n;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <=5; i++) {
			System.out.print("Enter number : ");
			n=sc.nextInt();
			sum+=n;
		}
		System.out.println("sum = "+sum);
		System.out.println("avg = "+sum/5);
	}
}
public class Question12 {
	public static void main(String[] args) {
		SumAndAverage obj = new SumAndAverage();
		obj.getSumAndAverage();
	}
}