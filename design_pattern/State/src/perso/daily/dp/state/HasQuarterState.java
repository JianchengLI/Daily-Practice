package perso.daily.dp.state;

public class HasQuarterState implements State {

	private NewGumballMachine _machine;
	
	public HasQuarterState(NewGumballMachine machine) {
		_machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You have already insert a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("A Quarter is return");
		_machine.setState(_machine.get_noQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned ...");
		_machine.setState(_machine.get_soldState());
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
