package perso.daily.jse.lambdas;

import java.util.Comparator;

public class CodeNotAlwaysObject {

	/**
	 * CODE = OBJECT ? As Java grew and matured, we found more places where
	 * treating blocks of - code as objects (data, really) was not only useful
	 * but necessary.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Listing 1 Inner classes had some strangeness to them, both in terms
		 * of syntax and semantics.
		 */
		InstanceOuter io = new InstanceOuter(12);
		InstanceOuter.InstanceInner ii = io.new InstanceInner();
		ii.printSomething();

		StaticOuter.StaticInner si = new StaticOuter.StaticInner();
		si.printSomething();

		/**
		 * Listing 2,3 Functional programming began to enter mainstream
		 * programming anonymous inner class syntax and clearly suffers from a
		 * "vertical problem" (meaning that the code takes too many lines to
		 * express the basic concept)
		 */
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Howdy, world!");
			}
		};
		r.run();

		/**
		 * Java 8 version is doing a little more than just generating an
		 * anonymous class that implements the Runnable interface — some of
		 * which has to do with the "invoke dynamic"
		 */
		Runnable r2 = () -> System.out.println("Howdy, world!");
		r2.run();

		/**
		 * Listing 4,5,6
		 * Functional interfaces : it is an interface that requires exactly one
		 * method to be implemented in order to satisfy the requirements of the
		 * interface.
		 */
		Comparator<String> c = (String lhs, String rhs) -> lhs.compareTo(rhs);
		int result = c.compare("Hello", "World");
		System.out.println(result);

		c = (String lhs, String rhs) -> {
			System.out.println("I am comparing " + lhs + " to " + rhs);
			return lhs.compareTo(rhs);
		};
		result = c.compare("Hello", "World");
		System.out.println(result);

		/**
		 * Target type is a Comparator<String>
		 * The String declarations in front of the lhs and rhs parameters are entirely redundant 
		 */
		c = (lhs, rhs) -> { 
			System.out.println("I am comparing " + lhs + " to " + rhs);
			return lhs.compareTo(rhs);
		};
		result = c.compare("Hello", "World");
		System.out.println(result);
		
		/**
		 * Listing 7,8
		 * One interesting side effect of Java’s lambda syntax is that for the first time in Java’s history, 
		 * we find something that cannot be assigned to a reference of type Object
		 */
		// Object o = () -> System.out.println("Howdy, world!"); ERROR will not compile
		Object o = (Runnable)() -> System.out.println("Howdy, world!");
		((Runnable) o).run();
		
		
		/**
		 * Listing 9
		 * Recall from earlier that lambda syntax works with any interface, so a lambda that is inferred 
		 * to a custom interface will also be inferred just as easily,
		 */
		Something something = (Integer i) -> {return i.toString();};
		System.out.println(something.doit(3));
	}
	
	interface Something {
		public String doit(Integer i);
	}
}
