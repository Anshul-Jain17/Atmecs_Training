package assignment_24_7_19;

class MatrixCyclicRotation{
	
	int mat[][];
	
	public MatrixCyclicRotation(int[][] mat) {
		this.mat = mat;
	}

	public void rotate(){
			for(int x=0;x<mat.length;x++){
				for(int y=x;y<mat.length-1-x;y++){
					int temp = mat[x][y];
					mat[x][y] = mat[mat.length-1-y][x];
					mat[mat.length-1-y][x] = mat[mat.length-1-x][mat.length-1-y];
					mat[mat.length-1-x][mat.length-1-y] = mat[y][mat.length-1-x];
					mat[y][mat.length-1-x] = temp;
				}
			}
	}
	
	public void display() {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
public class Question45 {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		MatrixCyclicRotation obj = new MatrixCyclicRotation(arr);
		obj.rotate();
		obj.display();
	}

}
