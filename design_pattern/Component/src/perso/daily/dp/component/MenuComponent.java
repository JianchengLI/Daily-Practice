package perso.daily.dp.component;

public abstract class MenuComponent{
	public abstract String getName();
	public abstract String getDescription();
	public abstract void add(MenuComponent component);
	public abstract void remove(MenuComponent component);
}
