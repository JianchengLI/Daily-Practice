package perso.daily.dp.state;

public class SoldOutState implements State {

	private NewGumballMachine _machine;
	
	public SoldOutState(NewGumballMachine machine) {
		_machine = machine;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}

}
