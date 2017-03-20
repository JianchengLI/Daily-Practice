package perso.daily.algorithms.dc;

public class MatrixMultiply {

	public static void main(String[] args) {
		int[][] A = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] B = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] C = SquareMatrixMult(A,B);
		
		for (int i = 0; i < C.length; i++) {
			System.out.println("Row " + i + " : ");
			for (int j = 0; j < C.length; j++) {
				System.out.print("--Col " + j + " : ");
				System.out.println("" + C[i][j]);
			}
		}
	}

	public static int[][] SquareMatrixMult(int[][] A, int[][] B){
		int[][] C = new int[A.length][];
		for (int i = 0; i < A.length; i++) {
			C[i] = new int[A[0].length];
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < B.length; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return C;
		
	}
}
