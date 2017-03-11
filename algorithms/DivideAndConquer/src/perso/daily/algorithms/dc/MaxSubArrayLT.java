package perso.daily.algorithms.dc;
/**
 * Liner Time / Not Divide Conquer 
 * @author Jiancheng
 * T(n) = n
 */
public class MaxSubArrayLT {

	public static void main(String[] args) {
		int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
		linearTimeAlgo(A).print();
	}

	public static MaxSubArray linearTimeAlgo(int[] A){
		int max_left = 0, max_right = 0, max_sum = Integer.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			max += A[i];
			if( max < 0 ){
				max = 0;
				max_left = i + 1;
				max_right = i + 1;
				continue;
			}
			if( max > max_sum ){
				max_sum = max; 
				max_right = i;
			}

		}
		return new MaxSubArray(max_left, max_right, max_sum);
	}
}
