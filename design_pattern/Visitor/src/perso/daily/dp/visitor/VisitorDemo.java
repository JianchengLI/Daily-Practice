package perso.daily.dp.visitor;

public class VisitorDemo {
	static public void main(String[] args) {
		Car car = new Car();
		Visitor visitor = new PrintVisitor();
		car.accept(visitor);
	}
}