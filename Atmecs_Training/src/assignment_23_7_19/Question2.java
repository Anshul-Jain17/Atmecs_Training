package assignment_23_7_19;
import java.util.Scanner;
class Quadratic{
	int a,b,c,det,x,y;

	public Quadratic(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void findRoots() {
		det = b*b - 4*a*c;
		if(det==0) {
			System.out.println("The roots are real and equal");
			x= (-b-det)/2*a;
			System.out.println("x = "+x+" y ="+x);
		}
		else if(det>0) {
			System.out.println("The roots are real and different");
			x= (-b+det)/2*a;
			y= (-b-det)/2*a;
			System.out.println("x = "+x+" y = "+y);
		}
		else {
			System.out.println("The roots are imaginary");
		}
	}
}
public class Question2 {
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a");
		a=sc.nextInt();
		System.out.print("Enter the value of b");
		b=sc.nextInt();
		System.out.print("Enter the value of c");
		c=sc.nextInt();
		Quadratic obj = new Quadratic(a, b, c);
		obj.findRoots();
	}
}
