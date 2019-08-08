package assignment_23_7_19;
public class Question20 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0&&j%2!=0  || i%2!=0&&j%2==0 ) {
					System.out.print("0");
				}
				if(i%2==0&&j%2==0  || i%2!=0&&j%2!=0 ) {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
