package perso.daily.dp.proxy;

public class GumballMachine {
	String location;
	int count;
	
	public GumballMachine(String location, int count) {
		super();
		this.location = location;
		this.count = count;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
}	
