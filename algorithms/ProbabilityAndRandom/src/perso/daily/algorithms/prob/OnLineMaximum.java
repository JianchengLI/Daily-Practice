package perso.daily.algorithms.prob;

public class OnLineMaximum {
	
	public static void main(String[] args) {
		int[] scores = {1,2,8,3,7,3,4,5,6,9,2,7,3,5,8,7,2,3,5,5,6};
		System.out.println(MAXIMUM(4, scores));
		System.out.println(MAXIMUM(10, scores));
	}
	
	/*
	 * Find the big one after K but greater than all of values before K
	 */
	public static int MAXIMUM(int k, int[] scores){
		int bestscore = Integer.MIN_VALUE;
		int counter = 0;
		for (int i = 0; i < k; i++) {
			counter++;
			if (scores[i] > bestscore) {
				bestscore = scores[i];
			}
		}
		for (int i = k; i < scores.length; i++) {
			counter++;
			if (scores[i] > bestscore) {
				bestscore = scores[i];
				break;
			}
		}
		System.out.println("Iteration : " + counter);
		return bestscore;
	}
}
