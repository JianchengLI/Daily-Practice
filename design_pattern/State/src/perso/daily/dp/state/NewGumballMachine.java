package perso.daily.dp.state;

public class NewGumballMachine {
	private State _soldOutState;
	private State _noQuarterState;
	private State _hasQuaterState;
	private State _soldState;
	
	private State _state = _soldOutState;
	private int _count = 0;
	
	public NewGumballMachine(int count) {
		_soldOutState = new SoldOutState(this);
		_noQuarterState = new NoQuarterState(this);
		_hasQuaterState = new HasQuarterState(this);
		_soldState = new SoldState(this);
		_count = count;
		
	}
	
	public void insertQuarter() {
		_state.insertQuarter();
	}

	public void ejectQuarter() {
		_state.ejectQuarter();
	}

	public void turnCrank() {
		_state.turnCrank();
	}
	
	public void setState(State state){
		_state = state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rollingout the slot ...");
		if (_count != 0) {
			_count--;
		}
	}

}
