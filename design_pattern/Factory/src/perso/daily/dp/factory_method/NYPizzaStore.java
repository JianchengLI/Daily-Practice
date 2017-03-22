package perso.daily.dp.factory_method;

import perso.daily.dp.factory.simple.NYStyleCheesePizza;
import perso.daily.dp.factory.simple.NYStylePepperoniPizza;
import perso.daily.dp.factory.simple.NYStyleVeggiePizza;
import perso.daily.dp.factory.simple.Pizza;
import perso.daily.dp.factory.simple.PizzaType;

public class NYPizzaStore extends PizzaStore {

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
