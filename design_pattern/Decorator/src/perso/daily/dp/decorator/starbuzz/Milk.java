package perso.daily.dp.decorator.starbuzz;

public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.base = .20;
	}

}
