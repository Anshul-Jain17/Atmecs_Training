package assignment_23_7_19;
public class Question26 {
	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			char ch='A';
			for(int j=1;j<=7-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch++);
			}
			ch-=2;
			for(int k=i-1;k>=1;k--) {
				System.out.print(ch--);
			}
			System.out.println();
		}
		for(int i=7-1;i>=1;i--) {
			char ch='A';
			for(int j=1;j<=7-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch++);
			}
			ch-=2;
			for(int k=i-1;k>=1;k--) {
				System.out.print(ch--);
			}
			System.out.println();
		}
	}
}