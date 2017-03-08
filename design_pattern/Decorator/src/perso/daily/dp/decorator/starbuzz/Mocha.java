package perso.daily.dp.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.base = .30;
	}

}
