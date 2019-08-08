package assignment_23_7_19;
import java.util.Scanner;
class NaturalSeriesSum{
	int n;
	
	public NaturalSeriesSum(int n) {
		this.n = n;
	}

	public void printSeriesAndSum() {
		int sum=0;
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum = "+sum);
	}
}
public class Question11 {
	public static void main(String[] args) {
		int n=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values to print: ");
		n=sc.nextInt();	
		NaturalSeriesSum obj = new NaturalSeriesSum(n);
		obj.printSeriesAndSum();
	}
}
