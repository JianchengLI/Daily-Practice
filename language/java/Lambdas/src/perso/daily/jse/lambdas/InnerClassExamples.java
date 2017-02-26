package perso.daily.jse.lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//Listing 10 
//class Hello {
//	public Runnable r = new Runnable() {
//		public void run() {
//			System.out.println(this);
//			System.out.println(toString());
//		}
//	};
//
//	public String toString() {
//		return "Hello's custom toString()";
//	}
//}

/**
 * Listing 11
 */
class Hello {
	public Runnable r = new Runnable() {
		public void run() {
			System.out.println(Hello.this);
			System.out.println(Hello.this.toString());
		}
	};

	public String toString() {
		return "Hello's custom toString()";
	}
}

/**
 * Listing 12
 */
class HelloLambdas {
	public Runnable r = () -> {
		System.out.println(this);
		System.out.println(toString());
	};

	public String toString() {
		return "Hello's custom toString()";
	}
}

class Person {
	public String firstName;
	public String lastName;
	public int age;

	public final static Comparator<Person> compareFirstName = 
			(lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

	public final static Comparator<Person> compareLastName = 
			(lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

	public static int compareFirstNames(Person lhs, Person rhs) {
			  return lhs.firstName.compareTo(rhs.firstName);
	}
	
	public String toString() {
	    return "[Person: firstName:" + firstName + " " +
	      "lastName:" + lastName + " " +
	      "age:" + age + "]";
    }
	
	public Person(String f, String l, int a) {
		firstName = f;
		lastName = l;
		age = a;
	}
}

public class InnerClassExamples {
	public static void main(String... args) {
		Hello h = new Hello();
		/**
		 * Listing 10 both the keyword this and the call to toString in the
		 * implementation of the anonymous Runnable are bound to the anonymous
		 * inner class implementation
		 * 
		 * Listing 11 we have to explicitly qualify it using the “outer this”
		 * syntax from the inner classes portion of the Java Specification
		 */
		h.r.run();
		HelloLambdas hl = new HelloLambdas();

		/**
		 * Listing 12, 13, 14 Lambdas, however, are lexically scoped, meaning
		 * that a lambda recognizes the immediate environment around its
		 * definition as the next outermost scope.
		 */
		hl.r.run();

		final String message = "Howdy";
		final StringBuilder sb = new StringBuilder();
		sb.append(message);
		final Runnable r = () -> System.out.println(sb);
		sb.append(" world!");
		r.run();

		/**
		 * Listing 15, 16
		 */
		Person[] people = new Person[] { 
				new Person("Ted", "Neward", 41), 
				new Person("Charlotte", "Neward", 41),
				new Person("Michael", "Neward", 19), 
				new Person("Matthew", "Neward", 13) 
		};
		// Sort by first name
		Arrays.sort(people, (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName));
		Arrays.sort(people, Person::compareFirstNames);
		for (Person p : people)
			System.out.println(p);
	}
}
