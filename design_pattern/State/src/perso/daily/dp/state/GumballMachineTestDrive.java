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
	}

}
