package perso.daily.jse.generic;

class BoxBoundedTypes<T> {
	private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    
    public <U extends Number > void inspect2(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    
}


class NaturalNumber<T extends Number> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
    	// In addition to limiting the types you can use to instantiate a generic type,
    	// bounded type parameters allow you to invoke methods defined in the bounds:
        return n.intValue() % 2 == 0;
    }
}


// A type variable with multiple bounds is a subtype of all the types listed in the bound. 
// If one of the bounds is a class, it must be specified first.
// Class A { /* ... */ }
// interface B { /* ... */ }
// interface C { /* ... */ }
//     class D <T extends A & B & C> { /* ... */ }

// If bound A is not specified first, you get a compile-time error:
//     class D <T extends B & A & C> { /* ... */ }  // compile-time error


public class BoundedTypeParameters<T> {
    public static void main(String[] args) {
    	BoxBoundedTypes<Integer> integerBox = new BoxBoundedTypes<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect(1);
        //integerBox.inspect("some text"); // error: this is still String!
    }
}



