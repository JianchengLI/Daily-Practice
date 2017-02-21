package perso.daily.jse.generic;

public class GenericsInheritanceAndSubtypes {

	public static void boxTest(BoxGenericTypes<Number> n) { 
		System.out.println(n.get());
	}
	
	public static <T extends Number> void boxTest2(BoxGenericTypes<T> n) { 
		System.out.println(n.get());
	}
	
	public static void main(String[] args) {
		
		BoxGenericTypes<Number> box = new BoxGenericTypes<>();
		box.set(new Integer(10));   // OK
		box.set(new Double(10.1));  // OK
		boxTest(box);
		
		BoxGenericTypes<Integer> box2 = new BoxGenericTypes<>();
		box2.set(10);
		BoxGenericTypes<Double> box3 = new BoxGenericTypes<>();
		box3.set(10.05);
		BoxGenericTypes<String> box4 = new BoxGenericTypes<>();
		box4.set("apple");
		
		// boxTest(box2); Error
		// boxTest(box3); Error
		
		boxTest2(box2);
		boxTest2(box3);
		// boxTest2(box4);// Error
	}
}
