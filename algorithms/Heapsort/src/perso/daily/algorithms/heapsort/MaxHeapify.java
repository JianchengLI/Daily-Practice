package perso.daily.algorithms.heapsort;

public class MaxHeapify {
	
	public static void main(String[] args) {
		int[] A = {27,17,3,16,13,10,1,5,7,12,4,8,9,0};
		int x = 3; // 1 < x <= A.length
		MAX_HEAPIFY(A, x, A.length);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
 	}
	
	public static void MAX_HEAPIFY(int[] A, int i, int size){
		int left = Left(i);
		int right = Right(i);
		
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
	
	public static int Left(int i){
		return i*2;
	}
	
	public static int Right(int i){
		return i*2+1;
	}
}
