package perso.daily.dp.iterator;

public class Concrete {
	private String _name;

	public Concrete(String _name) {
		super();
		this._name = _name;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	@Override
	public String toString() {
		return _name;
	}
}
