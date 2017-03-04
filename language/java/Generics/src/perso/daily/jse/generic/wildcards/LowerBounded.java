package perso.daily.jse.generic.wildcards;

import java.util.Arrays;
import java.util.List;

public class LowerBounded {

	public static void main(String[] args) {
		List<Number> l1 = Arrays.asList(1,2,3);
		List<Object> l2 = Arrays.asList(1,2,3);
		addNumbers(l1);
		addNumbers(l2);
	}

	public static void addNumbers(List<? super Integer> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
}
