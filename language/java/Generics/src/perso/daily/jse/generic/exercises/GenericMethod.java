package perso.daily.jse.generic.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GenericMethod {

	public static void main(String[] args) {
		// Exercise 1
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(countByCondition(l1, n -> n % 2 == 0));

		List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		System.out.println(countByCondition(l2, n -> isPrimeNumber(n)));
		
		List<String> l3 = Arrays.asList("ac", "ab", "aba", "appa", "abc");
		System.out.println(countByCondition(l3, n -> istPalindrom(n.toCharArray())));
		
		Integer[] a1 = {1,2,3};
		String[] a2 = {"1","2","3"};
		swap(a1, 1, 2);
		swap(a2, 1, 2);
		System.out.println();
		print(a1);
		System.out.println();
		print(a2);
	}

	public static <T> void print(T[] list){
	    for (T t : list) {
			System.out.println(t);
		}
	}
	
	// Exercise 1
	public static <T> int countByCondition(List<T> list, Predicate<T> predicate) {
		int counter = 0;
		for (T n : list) {
			if (predicate.test(n)) {
				counter++;
			}
		}
		return counter;
	}
	
	// Exercise 2
	public static <T> void swap(T[] l1, int i, int j){
		T temp = l1[i];
		l1[i] = l1[j];
		l1[j] = temp;
	}

	public static boolean isPrimeNumber(int i) {
		int factors = 0;
		int j = 1;

		while (j <= i) {
			if (i % j == 0) {
				factors++;
			}
			j++;
		}
		return (factors == 2);
	}
	
	public static boolean istPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
}
