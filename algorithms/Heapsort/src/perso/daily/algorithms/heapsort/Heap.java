package perso.daily.algorithms.heapsort;

public class Heap {
	
	public static void main(String[] args) {
		int[] A = {4,1,3,2,16,9,10,14,8,7};
		SORT(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
	public static void  MAX_HEAPIFY(int[] A, int i, int size){
		int left = 2*i;
		int right = 2*i + 1;
		
		int largest = (left <= size && A[left-1] > A[i-1]) ? left : i;
		if (right <= size && A[right-1] > A[largest-1]) 
			largest = right;
		
		if (largest != i) {
			int tmp = A[largest-1];
			A[largest-1] = A[i-1];
			A[i-1] = tmp;
			MAX_HEAPIFY(A, largest, size);
		}
	}
	
	public static void BUILD_MAX_HEAP(int[] A){
		for (int i=A.length/2; i > 0; i--) {
			MAX_HEAPIFY(A, i, A.length);
		}
	}
	
	public static void SORT(int[] A){
		int heap_size = A.length;
		BUILD_MAX_HEAP(A);
		for (int i = A.length; i >= 2; i--) {
			int tmp = A[0];
			A[0] = A[i-1];
			A[i-1] = tmp;
			heap_size--;
			MAX_HEAPIFY(A, 1, heap_size);
		}
	}
}
