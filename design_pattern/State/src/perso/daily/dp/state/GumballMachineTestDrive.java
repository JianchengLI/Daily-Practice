package perso.daily.dp.state;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(5);
		machine.insertQuarter();
		machine.insertQuarter();
		machine.ejectQuarter();
		machine.ejectQuarter();
		machine.insertQuarter();
		machine.turnQuarter();
		machine.insertQuarter();
		machine.turnQuarter();
		machine.insertQuarter();
		machine.turnQuarter();
		machine.insertQuarter();
		machine.turnQuarter();
		machine.insertQuarter();
		machine.turnQuarter();
		
		System.out.println("");
		System.out.println("New Machine Testing ...");
		NewGumballMachine newMachine = new NewGumballMachine(5);
		newMachine.insertQuarter();
		newMachine.insertQuarter();
		newMachine.ejectQuarter();
		newMachine.ejectQuarter();
		newMachine.insertQuarter();
		newMachine.turnCrank();
		newMachine.insertQuarter();
		newMachine.turnCrank();
		newMachine.insertQuarter();
		newMachine.turnCrank();
		newMachine.insertQuarter();
		newMachine.turnCrank();
		newMachine.insertQuarter();
		newMachine.turnCrank();
	}

}
