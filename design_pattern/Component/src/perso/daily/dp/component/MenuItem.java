package perso.daily.dp.component;

import java.util.List;
import java.util.Optional;

public class MenuItem extends MenuComponent {
	public MenuItem(String _name, String _description) {
		super(_name, _description);
	}
	@Override
	public void add(MenuComponent component) { /*Do Nothing */ }
	@Override
	public void remove(MenuComponent component) { /* Do Nothing */ }
	@Override
	public void onclick() {/* Do Nothing */}
	
	@Override
	public Optional<List<MenuComponent>> getChildren() {return Optional.empty();}
	
	@Override
	public void display() {
		System.out.println(getName());
	}

}
