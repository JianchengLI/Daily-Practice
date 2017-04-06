package perso.daily.dp.state;

public class SoldState implements State {

	private NewGumballMachine _machine;
	
	public SoldState(NewGumballMachine machine) {
		_machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

	@Override
	public void dispense() {
		_machine.releaseBall();
		if (_machine.get_count() > 0) {
			_machine.setState(_machine.get_noQuarterState());
		}else{
			System.out.println("Oops, out of gumballs");
			_machine.setState(_machine.get_soldOutState());
		}

	}

}
