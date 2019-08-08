package assignment_24_7_19;
import java.util.Arrays;
import java.util.Scanner;
class MatrixAntiDiagonalSum{
	int[][] arr,newarr;
	public MatrixAntiDiagonalSum(int len) {
		this.arr = new int[len][len];
	}
	
	public void matrixAntiDiagonalSum() {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter value: ");
				arr[i][j]= sc.nextInt();
				if(i+j == arr.length-1) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("Sum of Anti-Diagnoal of matrix: "+sum);
	}
	
}
public class Question37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int len = sc.nextInt();
		MatrixAntiDiagonalSum obj = new MatrixAntiDiagonalSum(len);
		obj.matrixAntiDiagonalSum();
	}
}
