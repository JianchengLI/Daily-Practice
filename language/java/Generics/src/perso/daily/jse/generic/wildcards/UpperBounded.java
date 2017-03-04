package perso.daily.jse.generic.wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBounded {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Double> l2 = Arrays.asList(1d,2d,3d);
		List<Float> l3 = Arrays.asList(1f,2f,3f);
		
		process(l1);
		process(l2);
		process(l3);
	}
	
	public static void process(List<? extends Number> list) {
	    for (Number elem : list) 
	    	System.out.println(elem);
	    System.out.println();
	}

}
