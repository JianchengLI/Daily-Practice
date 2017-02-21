package perso.daily.jse.generic;

class Util {
	// This is similar to declaring a generic type, 
	// but the type parameter's scope is limited to the method where it is declared
    public static <K, V> boolean compare(PairGenericMethod<K, V> p1, PairGenericMethod<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
}

class PairGenericMethod<K, V> {

    private K key;
    private V value;

    public PairGenericMethod(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}


public class GenericMethods {

	public static void main(String[] args) {
		PairGenericMethod<Integer, String> p1 = new PairGenericMethod<>(1, "apple");
		PairGenericMethod<Integer, String> p2 = new PairGenericMethod<>(2, "pen");
		System.out.println(Util.<Integer, String>compare(p1, p2));
		
		PairGenericMethod<Integer, String> p3 = new PairGenericMethod<>(1, "penapple");
		PairGenericMethod<Integer, String> p4 = new PairGenericMethod<>(1, "penapple");
		System.out.println(Util.compare(p3, p4));
	}

}
