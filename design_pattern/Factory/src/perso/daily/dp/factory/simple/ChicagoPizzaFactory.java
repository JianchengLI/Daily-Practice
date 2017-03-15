package perso.daily.dp.factory.simple;

public class ChicagoPizzaFactory extends SimplePizzaFactory {

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		if(type.equals(PizzaType.Cheese)){
			pizza = new CheesePizza();
		}else if (type.equals(PizzaType.Pepperoni)) {
			pizza = new PepperoniPizza();
		}else if (type.equals(PizzaType.Clam)) {
			pizza = new PepperoniPizza();
		}else if (type.equals(PizzaType.Veggie)) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
