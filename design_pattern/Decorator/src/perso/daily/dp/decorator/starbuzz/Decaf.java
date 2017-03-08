package perso.daily.dp.decorator.starbuzz;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		return 0.99;
	}

	
}
