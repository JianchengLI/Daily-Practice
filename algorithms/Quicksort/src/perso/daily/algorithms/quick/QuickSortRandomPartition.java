package perso.daily.algorithms.quick;

import java.util.Random;

public class QuickSortRandomPartition {

	public static void main(String[] args) {
		int[] A = {2,8,7,1,3,5,6,4};
		RANDOM_QUICKSORT(A, 0, A.length-1);
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+ ", ");
	}

	public static int RANDOM_PARTITION(int[] A, int p, int r){
		int i = RANDOM(p, r);
		exchange(A, r, i);
		return PARTITION(A, p, r);
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
	
	public static void RANDOM_QUICKSORT(int[] A, int p, int r){
		if (p < r) {
			int q = RANDOM_PARTITION(A, p, r);
			RANDOM_QUICKSORT(A, p, q-1);
			RANDOM_QUICKSORT(A, q+1, r);
		}
	}
	
	public static int RANDOM(int p, int r){
		Random random = new Random();
		return random.nextInt(r - p + 1) + p;
	}
	
	public static void exchange(int[] A, int i, int j){
		if (i != j) {
			int temp= A[i];
			A[i] = A[j];
			A[j] = temp;
		}
	}
}
