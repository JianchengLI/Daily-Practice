package perso.daily.algorithms.heapsort;

public class HeapSort {
	public static void main(String[] args) {
		int[] A = {4,1,3,2,16,9,10,14,8,7};
		HEAPSORT(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void HEAPSORT(int[] A){
		int heap_size = A.length;
		BuildMaxHeap.BUILD_MAX_HEAP(A);
		for (int i = A.length; i >= 2; i--) {
			int tmp = A[0];
			A[0] = A[i-1];
			A[i-1] = tmp;
			heap_size--;
			MaxHeapify.MAX_HEAPIFY(A, 1, heap_size);
		}
	}
}
