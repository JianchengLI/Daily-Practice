package perso.daily.dp.factory_method;

import perso.daily.dp.factory.simple.Pizza;
import perso.daily.dp.factory.simple.PizzaType;

public abstract class PizzaStore {
	public abstract Pizza createPizza(final PizzaType type);
	
	public Pizza orderPizza(final PizzaType type){
		final Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
