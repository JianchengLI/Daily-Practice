package perso.daily.algorithms.linearsort;

import java.util.Comparator;
import java.util.LinkedList;

public class BucketSort {
	public static void main(String[] argv) {
		int A[] = new int[]{ 78, 17, 39, 26, 72, 94, 21, 12, 23, 68};
		BUCKET_SORT(A);
	}
	
	public static void BUCKET_SORT(int[] A){
		LinkedList<Integer> B[] = new LinkedList[A.length];
		for (int i = 0; i < B.length; i++)
			B[i] = new LinkedList<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			int rangeIndex = findIndexByRange(A[i], A.length);
			insert(A[i], B[rangeIndex]);
		}
		
		for (LinkedList<Integer> linkedList : B) {
			linkedList.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.intValue() >= o2.intValue() ? 1 : 0;
				}
				
			});
		}
		System.out.println(B);
	}
	
	/**
	 * 0 < element < 100 divide into the number of A.length buckets
	 * @param element
	 * @return
	 */
	public static int findIndexByRange(int element, int bucketNum){
		return element/bucketNum;
	}
	
	public static void insert(int element, LinkedList<Integer> rangeList){
		rangeList.add(element);
	}
}
