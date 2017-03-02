package perso.daily.jse.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println("old way");
		for(Integer n : list) {
		    int x = n * n;
		    System.out.println(x);
		}
		System.out.println("new way");
		list.stream().map((x) -> (float)(x*x)).forEach(System.out::println);
	}
}
