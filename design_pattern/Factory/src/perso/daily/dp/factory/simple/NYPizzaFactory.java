package perso.daily.dp.factory.simple;

public class NYPizzaFactory extends SimplePizzaFactory{

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		if(type.equals(PizzaType.Cheese)){
			pizza = new NYStyleCheesePizza();
		}else if (type.equals(PizzaType.Pepperoni)) {
			pizza = new NYStylePepperoniPizza();
		}else if (type.equals(PizzaType.Clam)) {
			pizza = new NYStylePepperoniPizza();
		}else if (type.equals(PizzaType.Veggie)) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}

}
