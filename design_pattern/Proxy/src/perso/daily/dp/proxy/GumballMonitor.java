package perso.daily.dp.proxy;

public class GumballMonitor {
	GumballMachine machine;

	public GumballMonitor(GumballMachine machine) {
		super();
		this.machine = machine;
	}
	
	public void report(){
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("current inventory: " + machine.getCount());
	}
}
