package perso.daily.algorithms.dc;
/**
 * Liner Time / Not Divide Conquer 
 * @author Jiancheng
 * T(n) = n
 */
public class MaxSubArrayLT {

	public static void main(String[] args) {
		int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
		int[] B = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		linearTimeAlgo(A).print();
		linearTimeAlgo(B).print();
	}

	public static MaxSubArray linearTimeAlgo(int[] A){
		int max_left = 0, max_right = 0, max_sum = Integer.MIN_VALUE;
		int counter = 0;
		int max = 0;
		for (int i = 0; i < A.length; i++) { 
			max += A[i];
			
			if( max < 0 ){
				max = 0;
				max_left = i + 1;
				max_right = i + 1;
				counter ++;
				continue;
			}
			if( max > max_sum ){
				max_sum = max; 
				max_right = i;
				counter ++;
			}

		}
		System.out.println("MaxSubArrayLT : " + counter);
		return new MaxSubArray(max_left, max_right, max_sum);
	}
}
