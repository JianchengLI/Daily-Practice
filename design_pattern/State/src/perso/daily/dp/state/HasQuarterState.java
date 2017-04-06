package perso.daily.dp.state;

import java.util.Random;

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
		
		Random random = new Random();
		int randomNum = random.nextInt((4) + 1) + 1; // 1 - 5
		if (randomNum == 1) {
			System.out.println("Winner !!");
			_machine.setState(_machine.get_winnerState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
