package perso.daily.dp.state;

public class WinnerState implements State {

	private NewGumballMachine _machine;
	
	public WinnerState(NewGumballMachine machine) {
		_machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please waitting");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you have already turned Crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Please waitting, you have already turned Crank");

	}

	@Override
	public void dispense() {
		_machine.releaseBall();
		_machine.releaseBall();
		if (_machine.get_count() > 0) {
			_machine.setState(_machine.get_noQuarterState());
		}else{
			System.out.println("Oops, out of gumballs");
			_machine.setState(_machine.get_soldOutState());
		}
	}

}
