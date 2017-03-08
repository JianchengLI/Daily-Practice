package perso.daily.dp.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {

	protected Beverage beverage;
	protected double base;

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + this.getClass().getSimpleName();
	}

	@Override
	public double cost() {
		switch (size) {
		case TALL:
			base += .10;
			break;
		case GRANDE:
			base += .15;
			break;
		case VENTI:
			base += .20;
			break;
		default:
			break;
		}
		return base + beverage.cost();
	}

}
