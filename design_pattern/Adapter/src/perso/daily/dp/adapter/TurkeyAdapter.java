package perso.daily.dp.adapter;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	
	public TurkeyAdapter(perso.daily.dp.adapter.Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
