package perso.daily.dp.proxy;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		
		GumballMachine gumballMachine = new GumballMachine("Somewhere", 110);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		
		monitor.report();
	}

}
