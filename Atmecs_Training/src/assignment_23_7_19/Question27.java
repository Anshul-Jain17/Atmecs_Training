package assignment_23_7_19;
import java.util.Scanner;
public class Question27 {

	public static void main(String[] args) {
		int val=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		val = sc.nextInt();
		if(val==0) 
			System.out.println("zero");
		else if(val>0)
			System.out.println("positive");
		else 
			System.out.println("negative");
	}

}
