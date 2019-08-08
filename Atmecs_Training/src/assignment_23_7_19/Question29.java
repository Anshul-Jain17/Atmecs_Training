package assignment_23_7_19;
import java.util.Scanner;
public class Question29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num;
		Long l = Long.valueOf("10000000000");
		int cnt=0;
		System.out.println("Enter a number: ");
		num=sc.nextLong();
		if(num<l) {
			while(num!=0) {
				num/=10;
				cnt++;
			}
			System.out.println(cnt);
		}
		else {
			System.out.println("input a number less that 10000000000");
		}
		sc.close();
	}
}