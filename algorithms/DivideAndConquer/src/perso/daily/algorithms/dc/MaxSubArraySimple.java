package perso.daily.algorithms.dc;

/**
 * Simple Violent
 * @author Jiancheng
 * T(n) = n * n
 */
public class MaxSubArraySimple {

	public static void main(String[] args) {
		int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		SimpleAlgo(A).print();
	}
	
	private static MaxSubArray SimpleAlgo(int[] A){
		int max_left = 0, max_right = 0, max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < A.length-1; i++) {
			int sum = 0;
			for (int j = i; j < A.length-1; j++) {
				sum += A[j];
				if (sum > max_sum) {
					max_left = i;
					max_right = j;
					max_sum = sum;
				}
			}
		}
		MaxSubArray maxSubArray = new MaxSubArray(max_left, max_right, max_sum);
		return maxSubArray;
	}

}
