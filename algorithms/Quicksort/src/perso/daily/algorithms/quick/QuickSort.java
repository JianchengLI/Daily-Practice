package perso.daily.algorithms.quick;

public class QuickSort {

	public static void main(String[] args) {

	}

	public static int PARTITION(int[] A, int p, int r){
		return 0;
	}
	
	public static void QUICKSORT(int[] A, int p, int r){
		if (p < r) {
			int q = PARTITION(A, p, r);
			QUICKSORT(A, p, q);
			QUICKSORT(A, q+1, r);
		}
	}
}
