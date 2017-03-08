package perso.daily.dp.decorator.starbuzz;

public abstract class Beverage {

	protected String description = "Unknown Beverage";
	protected Size size = Size.UNKNOWN;
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}