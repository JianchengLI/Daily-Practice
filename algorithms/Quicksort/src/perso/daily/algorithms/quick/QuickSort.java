package perso.daily.algorithms.quick;

public class QuickSort {

	public static void main(String[] args) {
		int[] A = {2,1,3};
		int pivot = PARTITION(A, 0, A.length-1);
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+ ", ");
		
		System.out.println("Pivot : " + pivot);

		int[] A1 = {2,8,7,1,3,5,6,4};
		QUICKSORT(A1, 0, A1.length-1);
		for (int i = 0; i < A1.length; i++)
			System.out.print(A1[i]+ ", ");
	}

	public static int PARTITION(int[] A, int p, int r){
		int x = A[r];// Pivot
		int i = p-1;
		for (int j = p; j <= r-1; j++) {
			if (A[j] <= x) {
				i++;
				exchange(A, i, j);
			}
		}
		exchange(A, i+1, r);
		return i+1;
	}
	
	public static void QUICKSORT(int[] A, int p, int r){
		if (p < r) {
			int q = PARTITION(A, p, r);
			QUICKSORT(A, p, q-1);
			QUICKSORT(A, q+1, r);
		}
	}
	
	public static void exchange(int[] A, int i, int j){
		if (i != j) {
			int temp= A[i];
			A[i] = A[j];
			A[j] = temp;
		}
	}
}
