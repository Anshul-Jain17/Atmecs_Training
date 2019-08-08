package assignment_23_7_19;
import java.util.Scanner;
class Table{
	int num;

	public Table(int num) {
		this.num = num;
	}
	
	public void printTable() {
		for (int i = 1; i <=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}
public class Question14 {
	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print table: ");
		num=sc.nextInt();
		Table obj = new Table(num);
		obj.printTable();
	}
}