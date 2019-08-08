package assignment_23_7_19;
import java.util.Scanner;
class Cube{
	int num;

	public Cube(int num) {
		this.num = num;
	}
	
	public void getCube() {
		int cube=1;
		for (int i = 1; i <=3; i++) {
			cube*=num;
		}
		System.out.println("cube = "+cube);
	}
}
public class Question13 {
	public static void main(String[] args) {
		int num=0,cube=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		num=sc.nextInt();
		new Cube(num).getCube();
	}
}