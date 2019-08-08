package assignment_23_7_19;
public class Question21 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=7-1;i>=1;i--) {
			for(int j=1;j<=7-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}