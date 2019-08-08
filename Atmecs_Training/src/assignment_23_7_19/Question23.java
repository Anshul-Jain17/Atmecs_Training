package assignment_23_7_19;
public class Question23 {
	public static void main(String[] args) {
		for(int i=6;i>=1;i--) {
			for(int k=1;k<=6-i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}