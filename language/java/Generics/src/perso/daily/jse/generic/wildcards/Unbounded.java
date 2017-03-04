package perso.daily.jse.generic.wildcards;

import java.util.Arrays;
import java.util.List;

public class Unbounded {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Double> l2 = Arrays.asList(1d,2d,3d);
		List<Float> l3 = Arrays.asList(1f,2f,3f);
		
		printList(l1);
		printList(l2);
		printList(l3);
	}
	// ? = Object
	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
}
