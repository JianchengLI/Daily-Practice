package perso.daily.algorithms.dc;

public class MaxSubArray {
	private int low;
	private int high;
	private int sum;
	
	public void setLow(int low) {
		this.low = low;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getLow() {
		return low;
	}
	public int getHigh() {
		return high;
	}
	public int getSum() {
		return sum;
	}
	
	public MaxSubArray(int low, int high, int sum) {
		super();
		this.low = low;
		this.high = high;
		this.sum = sum;
	}
	
	public void print() {
		System.out.println("Low : " + this.getLow());
		System.out.println("High : " + this.getHigh());
		System.out.println("Sum : " + this.getSum());
	}
	
	
}
