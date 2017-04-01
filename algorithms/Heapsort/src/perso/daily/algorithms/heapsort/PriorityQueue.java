package perso.daily.algorithms.heapsort;

public class PriorityQueue {
	private static int[] _heap; 
	
	public PriorityQueue(int[] heap) {
		Heap.BUILD_MAX_HEAP(heap);
		_heap = heap;
	}

	public void display(){
		for (int i = 0; i < _heap.length; i++) {
			System.out.print(_heap[i] + ", ");
		}
		System.out.println("");
	}
	
	public void INSERT(int x){
		int[] A1 = new int[_heap.length+1];
		for (int i = 0; i <_heap.length; i++) {
			A1[i] = _heap[i];
		}
		A1[_heap.length] = Integer.MIN_VALUE;
		_heap = A1;
		INCREASE_KEY(_heap.length, x);
	}
	
	public int MAXIMUM(int[] A){
		return A[0];
	}
	
	public int EXTRACT_MAX(){
		int[] A1 = new int[_heap.length-1];
		for (int i = 1; i < _heap.length; i++) {
			A1[i-1] = _heap[i];
		}
	    int max = MAXIMUM(_heap);
	    _heap = A1;
	    return max;
	}
	
	public void INCREASE_KEY(int i, int key){
		if (_heap[i-1] > key) {
			System.out.println("new key is smaller than current key");
		}
		
		_heap[i-1] = key;
		while (i> 1 && _heap[PARENT(i)-1] < _heap[i-1]) {
			int tmp = _heap[PARENT(i)-1];
			_heap[PARENT(i)-1] = _heap[i-1];
			_heap[i-1] = tmp;
			i = PARENT(i);
		}
	}
	
	public static int PARENT(int i){
		return i/2;
	}
	
	public static void main(String[] args) {
		int[] A = {4,1,3,2,16,9,10,14,8,7};
		PriorityQueue priorityQueue = new PriorityQueue(A);
		priorityQueue.display();
		
		System.out.println(priorityQueue.MAXIMUM(A));
		priorityQueue.INCREASE_KEY(9, 3);
		priorityQueue.INCREASE_KEY(9, 15);
		priorityQueue.display();
		
		priorityQueue.INSERT(17);
		priorityQueue.display();
		System.out.println(priorityQueue.EXTRACT_MAX());
		priorityQueue.display();
	}
	
}