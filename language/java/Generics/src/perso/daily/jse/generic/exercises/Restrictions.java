package perso.daily.jse.generic.exercises;

import java.io.File;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class Restrictions {
	/**
	   1 Cannot Instantiate Generic Types with Primitive Types
	   2 Cannot Create Instances of Type Parameters
	   3 Cannot Declare Static Fields Whose Types are Type Parameters
	   4 Cannot Use Casts or instanceof With Parameterized Types
	   5 Cannot Create Arrays of Parameterized Types
	   6 Cannot Create, Catch, or Throw Objects of Parameterized Types
	   7 Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
	 */
	public static void main(String[] args) {
		// 1 Cannot Instantiate Generic Types with Primitive Types
		// Pair<int, char> p = new Pair<>(8, 'a');  // compile-time error
		
		// 2 Cannot Create Instances of Type Parameters
		/* public static <E> void append(List<E> list) {
				E elem = new E();  // compile-time error
		    	list.add(elem);
		}*/
		
		// 3 Cannot Declare Static Fields Whose Types are Type Parameters
		/*class MobileDevice<T> {
		    private static T os;
		}
			MobileDevice<Smartphone> phone = new MobileDevice<>();
			MobileDevice<Pager> pager = new MobileDevice<>();
			
			MobileDevice.os ???
		*/
		
		// 4 Cannot Use Casts or instanceof With Parameterized Types
		/*public static <E> void rtti(List<E> list) {
		    if (list instanceof ArrayList<Integer>) {  // compile-time error
		        // ...
		    }
		}
			Because the Java compiler erases all type parameters in generic code
		*/
		
		// 5 Cannot Create Arrays of Parameterized Types
		// List<Integer>[] arrayOfLists = new List<Integer>[2];
		
		// 6 Cannot Create, Catch, or Throw Objects of Parameterized Types
		
		// Extends Throwable indirectly
		// class MathException<T> extends Exception { /* ... */ }    // compile-time error

		// Extends Throwable directly
		// class QueueFullException<T> extends Throwable { /* ... */ // compile-time error
		
		// However, use a type parameter in a throws clause:
		class Parser<T extends Exception> {
		     public void parse(File file) throws T {     // OK
		         // ...
		     }
		 }
		 
		 
		 // 7 Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
		 // A class cannot have two overloaded methods that will have the same signature after type erasure.
		 /*
		 public class Example {
		     public void print(Set<String> strSet) { }
		     public void print(Set<Integer> intSet) { }
		 }*/



	}

}
