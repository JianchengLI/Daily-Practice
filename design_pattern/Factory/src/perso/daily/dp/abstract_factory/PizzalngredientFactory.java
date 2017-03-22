package perso.daily.dp.abstract_factory;

public interface PizzalngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clams createClam();
	// ......
}
