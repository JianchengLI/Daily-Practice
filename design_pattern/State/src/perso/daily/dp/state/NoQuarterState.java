package perso.daily.dp.state;

public class NoQuarterState implements State {
	private NewGumballMachine _machine;
	
	public NoQuarterState(NewGumballMachine machine) {
		_machine = machine;
	}

	@Override
	public void insertQuarter() {
		_machine.setState(_machine.get_hasQuaterState());
		System.out.println("Insert a Quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't insert a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}
}