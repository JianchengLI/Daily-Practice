package perso.daily.dp.decorator.starbuzz;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.base = .25;
	}
}
