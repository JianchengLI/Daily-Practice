package perso.daily.dp.decorator.starbuzz;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.base = .15;
	}
}
