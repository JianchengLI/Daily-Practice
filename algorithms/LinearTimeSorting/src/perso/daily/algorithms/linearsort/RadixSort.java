package perso.daily.algorithms.linearsort;

public class RadixSort {
	public static void main(String[] argv) {
		int[] A = RadixSort.RADIX_SORT(new int[] { 329, 457, 657, 839, 436, 720, 355 });
		for (int i = 0; i < A.length; i++ ) {
			System.out.print(A[i] + ", ");
		}
	}
	
	public static int[] RADIX_SORT(int A[]){
		return RadixSort.COUNTING_SORT(A);
	}
	
	public static int[] COUNTING_SORT(int[] A) {
		for(int i=1; i<=3; i++){
			int[] B = new int[A.length];
			int k = 10;
			A = COUNTING_SORT(A, B, k, i);
		}
		return A;
	}

	private static int[] COUNTING_SORT(int[] A, int[] B, int k, int dimension) {
		int[] A_COL = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			
			// Respectively, take a single digit, ten digits, hundreds of bits
			A_COL[i] = (int) ((A[i]/Math.pow(k,dimension-1))%k);
		}
		int[] C = new int[k];

		for (int j = 0; j < A.length; j++)
			C[A_COL[j]] += 1;
		
		for (int i = 1; i < k; i++ )
			C[i] = C[i] + C[i-1];
	
		for (int j = A.length - 1; j >= 0; j--) {
			int a = A[j];
			int a_col_value = A_COL[j];
			B[C[a_col_value] - 1] = a;
			C[a_col_value] -= 1;
		}
		return B;
	} 

}
