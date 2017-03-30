package perso.daily.algorithms.heapsort;

public class BuildMaxHeap {
	public static void main(String[] args) {
		int[] A = {4,1,3,2,16,9,10,14,8,7};
		BUILD_MAX_HEAP(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void BUILD_MAX_HEAP(int[] A){
		for (int i=A.length/2; i > 0; i--) {
			MaxHeapify.MAX_HEAPIFY(A, i);
		}
	}
}
