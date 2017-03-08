package perso.daily.dp.decorator.starbuzz;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "DarkRoast Coffee";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
