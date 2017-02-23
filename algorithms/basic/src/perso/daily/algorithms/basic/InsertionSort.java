package perso.daily.algorithms.basic;


public class InsertionSort {
	public static void main(String[] args) {
		int[] a1 = {5,2,4,6,1,3};
        int[] a2 = a1.clone();
        
        bubble_sort(a1);
		for (int i : a1)
			System.out.print(i+".");
		
		System.out.println("");
		insertion_sort(a2);
		for (int i : a2)
			System.out.print(i+".");
	
	}

	public static int[] bubble_sort(int[] arr){
		int i,j, temp, counter = 0;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				counter ++;
			}
		}
		System.out.println("Iteration Bubble Sort: " + counter);
		return arr;
	} 
	
	public static int[] insertion_sort(int[] arr){
		int i, j, key, counter = 0;
		for (i = 1; i < arr.length; i++) {
			for (j = i-1;  j >= 0 && arr[j] > arr[j+1]; j--) {
				key = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = key;
				counter ++;
			}
		}
		System.out.println("Iteration Insertion Sort: " + counter);
		return arr;
	} 
}
