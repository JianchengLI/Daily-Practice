package perso.daily.algorithms.dc;

public class SquareMatrixMultiply {

	public static void main(String[] args) {
		
	}

	public int[][] SquareMatrixMult(int[][] A, int[][] B){
		int[][] C = new int[A.length][];
		for (int i = 0; i < A.length; i++) {
			C[i] = new int[B.length];
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < B.length; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
				
			}
		}
		return C;
		
	}
}
