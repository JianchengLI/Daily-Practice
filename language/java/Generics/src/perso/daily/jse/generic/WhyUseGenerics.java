package perso.daily.jse.generic;

import java.util.List;
import java.util.ArrayList;

public class WhyUseGenerics {

	public static void main(String[] args) {
		/**
		 * 1. Stronger type checks at compile time
		 * 2. Elimination of casts
		 * 3. Enabling programmers to implement generic algorithms
		 */
		
		List list = new ArrayList();
		list.add("String must be cast");
		String s = (String) list.get(0);
		System.out.println(s);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("String no cast");
		String s2 = list2.get(0);   // no cast
		System.out.println(s2);
	}
}
