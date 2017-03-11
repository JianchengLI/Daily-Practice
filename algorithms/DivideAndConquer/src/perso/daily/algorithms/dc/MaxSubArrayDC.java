package perso.daily.algorithms.dc;
/**
 * Divide Conquer 
 * @author Jiancheng
 * T(n) = n*log n
 */
public class MaxSubArrayDC {

	public static void main(String[] args) {
		int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		
		FIND_MAXIMUM_SUB_ARRAY(A, 0, A.length-1).print();
	}

	public static MaxSubArray FIND_MAXIMUM_SUB_ARRAY(int[] A, int low, int high) {
		int mid = (low + high) / 2;
		if (low == high){
			return new MaxSubArray(low, high, A[low]);
		}
		else{
			
			MaxSubArray leftMaxSubArray = FIND_MAXIMUM_SUB_ARRAY(A, low, mid);
			MaxSubArray rightMaxSubArray = FIND_MAXIMUM_SUB_ARRAY(A, mid+1, high);
			MaxSubArray crossMaxSubArray = FIND_MAX_CROSSING_SUB_ARRAY(A, low, mid, high);
			
			if(leftMaxSubArray.getSum() > rightMaxSubArray.getSum() && leftMaxSubArray.getSum() > crossMaxSubArray.getSum()){
				return leftMaxSubArray;
			}
			else if(rightMaxSubArray.getSum() > leftMaxSubArray.getSum() && rightMaxSubArray.getSum() > crossMaxSubArray.getSum()){
				return rightMaxSubArray;
			}
			else{
				return crossMaxSubArray;
			}
		}
	}

	public static MaxSubArray FIND_MAX_CROSSING_SUB_ARRAY(int[] A, int low, int mid, int high) {
		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		int max_left = 0,  max_right = 0, sum = 0;
		
		for (int i = mid; i > low; i--) {
			sum += A[i];
			if (sum > left_sum) {
				left_sum = sum;
				max_left = i;
			}
		}
		sum = 0;
		for (int j = mid +1; j < high; j++) {
			sum += A[j];
			if (sum > right_sum) {
				right_sum = sum;
				max_right = j;
			}
		}
		return new MaxSubArray(max_left, max_right,  left_sum + right_sum);
	}
}
