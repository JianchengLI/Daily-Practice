package perso.daily.algorithms.heapsort;

public class PriorityQueue {
	private int[] _heap; 
	
	public PriorityQueue(int[] heap) {
		Heap.BUILD_MAX_HEAP(heap);
		_heap = heap;
	}

	public void display(){
		for (int i = 0; i < _heap.length; i++) {
			System.out.println(_heap[i]);
		}
	}
	
	public static void INSERT(int[] A, int x){
		int[] A1 = new int[A.length+1];
		for (int i = 0; i < A.length; i++) {
			A1[i] = A[i];
		}
		A1[A.length] = Integer.MIN_VALUE;
		A = A1;
		INCREASE_KEY(A, A.length, x);
	}
	
	public static int MAXIMUM(int[] A){
		return A[0];
	}
	
	public static int EXTRACT_MAX(int[] A){
		return 0;
	}
	
	public static void INCREASE_KEY(int[] A, int i, int key){
		if (A[i] > key) {
			// Error
		}
		A[i] = key;
		while (i> 1 && A[i] < A[i]) {
			
		}
	}
	
	public static int PARENT(int i){
		return 0;
	}
	
	public static void main(String[] args) {
		int[] A = {4,1,3,2,16,9,10,14,8,7};
		PriorityQueue priorityQueue = new PriorityQueue(A);
		priorityQueue.display();
		
		System.out.println(priorityQueue.MAXIMUM(A));
	}
	
}
