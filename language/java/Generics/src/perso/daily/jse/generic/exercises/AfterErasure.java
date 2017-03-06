package perso.daily.jse.generic.exercises;

import java.util.List;

/*
class Pair<K, V> {
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey(); { return key; }
    public V getValue(); { return value; }

    public void setKey(K key)     { this.key = key; }
    public void setValue(V value) { this.value = value; }

    private K key;
    private V value;
}
*/

// After Erasure
class Pair2 {
	private Object key;
    private Object value;
    
    public Pair2(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() { return key; }
    public Object getValue() { return value; }

    public void setKey(Object key)     { this.key = key; }
    public void setValue(Object value) { this.value = value; }
}


public class AfterErasure {
	/*
	public static <T extends Comparable<T>> int findFirstGreaterThan(T[] at, T elem) {
		// ...
		return 0;
	};*/
	
	// After Erasure
	public static int findFirstGreaterThan(Comparable[] at, Comparable elem) {
		// ...
		return 0;
	};
	
	public static void main(String[] args) {
	}
}
