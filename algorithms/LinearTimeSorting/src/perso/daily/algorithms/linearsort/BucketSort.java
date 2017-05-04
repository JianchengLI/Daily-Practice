package perso.daily.algorithms.linearsort;

import java.util.LinkedList;

public class BucketSort {
	public static void main(String[] argv) {
		int A[] = new int[]{ 78, 17, 39, 26, 72, 94, 21, 12, 23, 68};
		A = BUCKET_SORT(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}
	
	public static int[] BUCKET_SORT(int[] A){
		LinkedList<Integer> B[] = new LinkedList[A.length];
		for (int i = 0; i < B.length; i++)
			B[i] = new LinkedList<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			int rangeIndex = findIndexByRange(A[i], A.length);
			insert(A[i], B[rangeIndex]); // insert sort
		}
		
		return bucketsToArray(B);
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
		int insertIndex = 0;
		for (int i = 0; i < rangeList.size(); i++) {
			if(element <= rangeList.get(i).intValue()){
				insertIndex = i;
				break;
			}
		}
		rangeList.add(insertIndex, element);
	}
	
	public static int[] bucketsToArray(LinkedList<Integer> B[]) {
		int A[] = new int[B.length]; // A.length == B.length
		int count = 0;
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].size(); j++) {
				A[count]= B[i].get(j).intValue();
				count ++;
			}
		}
		
		return A;
	}
}
