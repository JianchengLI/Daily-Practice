package perso.daily.jse.lambdas.function.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Student {
	public String name;
	public double gpa;

	Student(String name, double g) {
		this.name = name;
		this.gpa = g;
	}
}

public class TryConsumer {
	public static void main(String[] args) {
		
		// Example 1
		Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		c.accept("Java Lambda, Function Interface, Consumer.");

		// Example 2
		int x = 99;
		Consumer<Integer> myConsumer = (y) -> {
			System.out.println("x = " + (float) x); // Statement A
			System.out.println("y = " + y);
		};
		myConsumer.accept(x);

		// Example 3
		List<Student> students = Arrays.asList(new Student("John", 3), new Student("Mark", 4));

		acceptAllEmployee(students, e -> System.out.println(e.name));
		acceptAllEmployee(students, e -> { e.gpa *= 1.5; });
		acceptAllEmployee(students, e -> System.out.println(e.name + ": " + e.gpa));
	}

	public static void acceptAllEmployee(List<Student> student, Consumer<Student> printer) {
		for (Student e : student) {
			printer.accept(e);
		}
	}

}
