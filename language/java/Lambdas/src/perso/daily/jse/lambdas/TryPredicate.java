package perso.daily.jse.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class TryPredicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("All :");
		eval( list, n-> true );
		System.out.println("Even :");
		eval( list, n-> n%2 == 0 );
		System.out.println("More than 3:");
		eval( list, n-> n > 3 );
	}

	public static void eval(ArrayList<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}

}
