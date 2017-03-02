package perso.daily.jse.lambdas.function.interfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
	public void eat() {
	};
}

class Primes {
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

public class MethodReference {

	public static void main(String[] args) {

		// Integer::parseInt // Static method reference
		// System.out::print // Instance method reference
		// Person::new // Constructor method reference

		// 1. Static method reference
		Comparator<Integer> c2 = (x, y) -> Integer.compare(x, y);
		Comparator<Integer> c1 = Integer::compare; // c1 === c2

		// 2. Instance method reference
		List<Person> persons = Arrays.asList();
		persons.forEach(person -> person.eat());
		persons.forEach(Person::eat);

		persons.forEach(e -> System.out.println(e));
		persons.forEach(System.out::println);

		// 3. Constructor method reference
		List<String> strList = Arrays.asList();
		strList.stream().map(s -> new Integer(s));
		strList.stream().map(Integer::new);
	}

	// Simple Example by Method Reference
	public void distincPrimarySum(String numbers) {
		List<String> list = Arrays.asList(numbers);
		int sum = list.stream().mapToInt(Integer::new).filter(Primes::isPrime).distinct().sum();
	}

}
