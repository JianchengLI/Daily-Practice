package perso.daily.jse.generic;

class Box {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}

/**
 * A generic class is defined with the following format: class name<T1, T2, ...,
 * Tn> { } As you can see, all occurrences of Object are replaced by T. A type
 * variable can be any non-primitive type you specify: any class type, any
 * interface type, any array type, or even another type variable.
 */

/**
 * Generic version of the Box class.
 * 
 * @param <T>
 *            the type of the value being boxed
 */
class BoxGenericTypes<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

/**
 * Multiple Type Parameters
 */
interface Pair<K1, V1> {
	public K1 getKey();

	public V1 getValue();
}

class OrderedPair<K2, V2> implements Pair<K2, V2> {

	private K2 key;
	private V2 value;

	public OrderedPair(K2 key, V2 value) {
		this.key = key;
		this.value = value;
	}

	public K2 getKey() {
		return key;
	}

	public V2 getValue() {
		return value;
	}
}

public class GenericTypes {

	public static void main(String[] args) {
		// Integer, type argument
		BoxGenericTypes<Integer> integerBox;
		BoxGenericTypes<Integer> integerBox2 = new BoxGenericTypes<Integer>();
		BoxGenericTypes<Integer> integerBox3 = new BoxGenericTypes<>();

		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");

		OrderedPair<String, BoxGenericTypes<Integer>> p = new OrderedPair<>("primes", new BoxGenericTypes<Integer>());
		System.out.println(p.getKey());
		System.out.println(p.getValue());
	}
}
