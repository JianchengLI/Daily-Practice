package perso.daily.dp.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Menu extends MenuComponent {
	private List<MenuComponent> _components = new ArrayList<>();
	private MenuProviderFunction _providerFunction;
	
	
	public Menu(String name, String description, MenuProviderFunction providerFunction) {
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
			_providerFunction.initItemsByName(getName()).forEach((name,type)->{
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
