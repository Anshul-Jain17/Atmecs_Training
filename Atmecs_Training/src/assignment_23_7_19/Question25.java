package assignment_23_7_19;
public class Question25 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=7-1;i>=1;i--) {
			for(int j=1;j<=7-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}