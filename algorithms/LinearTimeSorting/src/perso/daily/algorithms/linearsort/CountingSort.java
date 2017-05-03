package perso.daily.algorithms.linearsort;

public class CountingSort {
	public static void main(String[] argv) {
		int[] A = CountingSort.COUNTING_SORT(new int[] { 16, 4, 10, 14, 7, 9, 3, 2, 8, 1 });
		for (int i = 0; i < A.length; i++ ) {
			System.out.print(A[i] + ", ");
		}
	}

	public static int[] COUNTING_SORT(int[] A) {
		int[] B = new int[A.length];
		int k = 100;
		COUNTING_SORT(A, B, k);
		return B;
	}

	private static void COUNTING_SORT(int[] A, int[] B, int k) {
		int[] C = new int[k];

		for (int j = 0; j < A.length; j++)
			C[A[j]] += 1;
		
		for (int i = 1; i < k; i++ )
			C[i] = C[i] + C[i-1];
	
		for (int j = A.length - 1; j >= 0; j--) {
			int a = A[j];
			B[C[a] - 1] = a;
			C[a] -= 1;
		}
	}
}
