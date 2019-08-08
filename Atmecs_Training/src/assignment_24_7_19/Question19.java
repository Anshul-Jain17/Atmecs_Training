package assignment_24_7_19;

import java.util.Scanner;

class MatrixAdd{
	int[][] mat1,mat2,sum;

	public MatrixAdd(int row,int col) {
		super();
		this.mat1 = new int[row][col];
		this.mat2 = new int[row][col];
		this.sum = new int[row][col];
	}
	
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in First Matrix: ");
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				System.out.print("Enter value: ");
				mat1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter values in Second Matrix: ");
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2[i].length;j++) {
				System.out.print("Enter value: ");
				mat2[i][j]=sc.nextInt();
			}
		}
	}
	
	public void sum() {
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2[i].length;j++) {
				sum[i][j] = mat1[i][j]+mat2[i][j];
			}
		}
	}
	
	public void display() {
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum[i].length;j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
public class Question19 {

	public static void main(String[] args) {
		int row,col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix row: ");
		row = sc.nextInt();
		System.out.println("Enter matrix col: ");
		col = sc.nextInt();
		MatrixAdd obj = new MatrixAdd(row,col);
		obj.takeInput();
		obj.sum();
		obj.display();
	}

}
