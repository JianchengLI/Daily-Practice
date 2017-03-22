package perso.daily.dp.factory_method;

import perso.daily.dp.factory.simple.ChicagoStyleCheesePizza;
import perso.daily.dp.factory.simple.ChicagoStylePepperoniPizza;
import perso.daily.dp.factory.simple.ChicagoStyleVeggiePizza;
import perso.daily.dp.factory.simple.Pizza;
import perso.daily.dp.factory.simple.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		if(type.equals(PizzaType.Cheese)){
			pizza = new ChicagoStyleCheesePizza();
		}else if (type.equals(PizzaType.Pepperoni)) {
			pizza = new ChicagoStylePepperoniPizza();
		}else if (type.equals(PizzaType.Clam)) {
			pizza = new ChicagoStylePepperoniPizza();
		}else if (type.equals(PizzaType.Veggie)) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}

}
