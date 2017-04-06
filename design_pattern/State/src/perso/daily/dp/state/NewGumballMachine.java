package perso.daily.dp.state;

public class NewGumballMachine {
	private State _soldOutState;
	private State _noQuarterState;
	private State _hasQuaterState;
	private State _soldState;
	private State _winnerState;
	
	private State _state = _soldOutState;
	private int _count = 0;
	
	public NewGumballMachine(int count) {
		_soldOutState = new SoldOutState(this);
		_noQuarterState = new NoQuarterState(this);
		_hasQuaterState = new HasQuarterState(this);
		_soldState = new SoldState(this);
		_winnerState = new WinnerState(this);
		
		_count = count;
		if (count > 0) {
			_state = _noQuarterState;
		}
	}
	
	public State get_soldOutState() {return _soldOutState;}
	public State get_noQuarterState() {return _noQuarterState;}
	public State get_hasQuaterState() {return _hasQuaterState;}
	public State get_soldState() {return _soldState;}
	public State get_winnerState(){return _winnerState;}
	public State get_state() {return _state;}
	public int get_count() {return _count;}

	public void setState(State state){
		_state = state;
	}
	
	public void insertQuarter() {
		_state.insertQuarter();
	}

	public void ejectQuarter() {
		_state.ejectQuarter();
	}

	public void turnCrank() {
		_state.turnCrank();
		_state.dispense();
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rollingout the slot ...");
		if (_count != 0) {
			_count--;
		}
	}

}
