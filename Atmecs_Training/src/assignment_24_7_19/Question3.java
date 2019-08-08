package assignment_24_7_19;
import java.util.Scanner;
class Grid{
	int n;
	
	public Grid(int n) {
		this.n = n;
	}
	public void makeGrid() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
public class Question3 {
	public static void main(String[] args) {
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		row = sc.nextInt();
		Grid obj = new Grid(row);
		obj.makeGrid();
	}
}
