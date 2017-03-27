package perso.daily.algorithms.basic;

public class MergeSort {

	
	public static void main(String[] args) {
		int[] array = { 5, 2, 4, 7, 1, 3, 2, 6};

		merge_sort(array, 0, array.length - 1);
		System.out.println("MergeSort : " + count);
		for (int i : array)
			System.out.print(i+".");
		
	}
	public static int count = 0;
	public static void merge_sort(int[] arr, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			merge_sort(arr, p, q);
			merge_sort(arr, q + 1, r);
			merge(arr, p, q, r);
		}
	}

	public static void merge(int[] arr, int p, int q, int r) {
		int x;
		int[] L = new int[(q - p) + 1];
		int[] R = new int[(r - (q + 1)) + 1];

		for (x = 0; x < L.length; x++)
			L[x] = arr[p + x];

		for (x = 0; x < R.length; x++)
			R[x] = arr[(q + 1) + x];

		int i = 0, j = 0, k;
		for (k = p; k <= r; k++) {
			if (i < L.length && (j == R.length || L[i] <= R[j])) {
				count++;
				arr[k] = L[i];
				i++;
				continue;
			}
			if (j < R.length && (i == L.length || R[j] < L[i])) {
				count++;
				arr[k] = R[j];
				j++;
			}
		}
	}
}
