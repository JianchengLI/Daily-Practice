package perso.daily.dp.component;
import java.util.List;
import java.util.Optional;

public abstract class MenuComponent{
	public MenuComponent(String _name, String _description) {
		super();
		this._name = _name;
		this._description = _description;
	}
	private String _name;
	private String _description;
	
	public void setSame(String _name) {this._name = _name;}
	public void setDescription(String _description) {this._description = _description;}
	public String getName(){return _name;};
	public String getDescription(){return _description;};
	
	public abstract void add(MenuComponent component);
	public abstract void remove(MenuComponent component);
	public abstract Optional<List<MenuComponent>> getChildren();
	public abstract void display();
	public abstract void onclick();
}