package perso.daily.dp.decorator.starbuzz;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		billPlease(beverage);
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		billPlease(beverage2);
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		billPlease(beverage3);
	}
	
	private static void billPlease(Beverage beverage) {
		System.out.println(beverage.getDescription() + ": $" + beverage.cost());
	}
}
