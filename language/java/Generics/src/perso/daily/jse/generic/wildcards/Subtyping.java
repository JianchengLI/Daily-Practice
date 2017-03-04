package perso.daily.jse.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {

	public static void main(String[] args) {
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>
	}
}
