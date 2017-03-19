package perso.daily.algorithms.dc;

public class SquareMatrixMultiplyStrassen {

	public static void main(String[] args) {
		int[][] A = {{1,2,3,4},
					 {1,2,3,4},
					 {1,2,3,4},
					 {1,2,3,4}
					};
		int[][] B = {{1,2,3,4},
				     {1,2,3,4},
				     {1,2,3,4},
				     {1,2,3,4}
				    };
		
 		int[][] C = StrassenMatrixMult(A,B); 
		
		for (int i = 0; i < C.length; i++) {
			System.out.println("Row " + i + " : ");
			for (int j = 0; j < C.length; j++) {
				System.out.print("--Col " + j + " : ");
				System.out.println("" + C[i][j]);
			}
		}
	}

	public static int[][] MatrixMult(int[][] A, int[][] B){
		int[][] C = new int[A.length][];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			C[i] = new int[A[0].length];
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < B.length; k++) {
					C[i][j] += A[i][k] * B[k][j];
					count ++;
				}
			}
		}
		System.out.println("MatrixMult : " + count);
		return C;
	}
	
	public static int[][] MatrixPlus(int[][] A, int[][] B){
		int n = A.length;
		int[][] C = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}
	
	/**
	 * Matrix A, B has same Size
	 * @param A
	 * @param B
	 * @return
	 */
	public static int[][] StrassenMatrixMult(int[][] A, int[][] B){
		int n = A.length;  // A.lenght == B.length
		int[][] C = new int[n][n];
		if (n == 1) {
			C[0][0] =A[0][0] * B[0][0];
		}else{
			CombineQuarterMatrix( C,
				MatrixPlus( // A11 * B11 + A12 * B21
					StrassenMatrixMult(PotionMatrix(A, Portion.LEFT_TOP),PotionMatrix(B, Portion.LEFT_TOP)), 
					StrassenMatrixMult(PotionMatrix(A, Portion.RIGHT_TOP),PotionMatrix(B, Portion.LEFT_BOT))
				),
				MatrixPlus( 
					StrassenMatrixMult(PotionMatrix(A, Portion.LEFT_TOP),PotionMatrix(B, Portion.RIGHT_TOP)), 
					StrassenMatrixMult(PotionMatrix(A, Portion.RIGHT_TOP),PotionMatrix(B, Portion.RIGHT_BOT))
				),
				MatrixPlus(
					StrassenMatrixMult(PotionMatrix(A, Portion.LEFT_BOT),PotionMatrix(B, Portion.LEFT_TOP)), 
					StrassenMatrixMult(PotionMatrix(A, Portion.RIGHT_BOT),PotionMatrix(B, Portion.LEFT_BOT))
				),
				MatrixPlus( 
					StrassenMatrixMult(PotionMatrix(A, Portion.LEFT_BOT),PotionMatrix(B, Portion.RIGHT_TOP)), 
					StrassenMatrixMult(PotionMatrix(A, Portion.RIGHT_BOT),PotionMatrix(B, Portion.RIGHT_BOT))
				)
			);
		}
		return C;
		
	}
	enum Portion {LEFT_TOP, LEFT_BOT, RIGHT_TOP, RIGHT_BOT}
	
	/**
	 * Matrix must be NxN
	 * @param matrix
	 * @param portion
	 * @return
	 */
	public static int[][] PotionMatrix(int[][] matrix, Portion portion){
		int n = matrix.length/2;
		switch (portion) {
			case LEFT_TOP:
				return initMatrixPortionByOffset(matrix, n, 0, 0);
			case RIGHT_TOP:
				return initMatrixPortionByOffset(matrix, n, 0, n);
			case LEFT_BOT:
				return initMatrixPortionByOffset(matrix, n, n, 0);
			case RIGHT_BOT:
				return initMatrixPortionByOffset(matrix, n, n, n);
			default:
				break;
		}
		throw new RuntimeException( "Invalid value for enum " + portion.name()); 
	}
	
	public static void CombineQuarterMatrix(int[][] C, int[][] C11, int[][] C12, int[][] C21, int[][] C22 ){
		int N = C.length;
		int n = N/2;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i<n && j<n) 
					C[i][j] = C11[i][j];
				if (i<n && j>=n)
					C[i][j] = C12[i][j-n];
				if (i>=n && j<n)
					C[i][j] = C21[i-n][j];
				if (i>=n && j>=n)
					C[i][j] = C22[i-n][j-n];
			}
		}
	}

	private static int[][] initMatrixPortionByOffset(int[][] matrix, int n, int offset_x, int offset_y) {
		int[][] A = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = matrix[i+offset_x][j+offset_y];
			}
		}
		return A;
	}
}
