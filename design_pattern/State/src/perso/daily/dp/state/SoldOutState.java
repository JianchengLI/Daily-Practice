package perso.daily.dp.state;

public class SoldOutState implements State {

	private NewGumballMachine _machine;
	
	public SoldOutState(NewGumballMachine machine) {
		_machine = machine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
