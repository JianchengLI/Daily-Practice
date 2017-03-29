package perso.daily.dp.component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Menu extends MenuComponent {
	private List<MenuComponent> _components = new ArrayList<>();
	private Function<String, LinkedHashMap<String, String>> _providerFunction;
	
	
	public Menu(String name, String description, Function<String, LinkedHashMap<String, String>> providerFunction) {
		super(name, description);
		this._providerFunction = providerFunction;
	}

	@Override
	public void add(MenuComponent component) {
		_components.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		_components.remove(component);
	}
	
	/*
	 * Dynamic loading menu items
	 */
	public void onclick(){
		if(_components.isEmpty()){
			_providerFunction.apply(getName()).forEach((name,type)->{
				if (type == "Menu") {
					add(new Menu( name, "",  _providerFunction ));
				}
				if (type == "MenuItem") {
					add(new MenuItem( name, ""));
				}
			});
		}
	}

	@Override
	public void display() {
		System.out.println(getName());
		_components.stream().forEach(component-> component.display());
		
	}

	@Override
	public Optional<List<MenuComponent>> getChildren() {
		return Optional.of(_components);
	}
}
