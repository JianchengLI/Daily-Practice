package perso.daily.dp.state;

public class GumballMachine {
	private final static int SOLD_OUT = 0;
	private final static int NO_QUARTER = 1;
	private final static int HAS_QUARTER = 2;
	private final static int SOLD = 3;
	
	private int _state = SOLD_OUT;
	private int _count = 0;
	
	public GumballMachine(int count){
		_count = count;
		if (_count > 0)
			_state = NO_QUARTER;
	}
	
	public void insertQuarter(){
		if (_state == HAS_QUARTER) {
			System.out.println("Already Quarter");
		}else if (_state == NO_QUARTER) {
			_state = HAS_QUARTER;
			System.out.println("Insert a Quarter");
		}else if (_state == SOLD_OUT) {
			System.out.println("SOLD OUT");
		}else if (_state == SOLD){
			System.out.println("Please wait, we're already giving you a gumball");
		}
	}
	
	public void ejectQuarter(){
		if (_state == HAS_QUARTER) {
			_state = NO_QUARTER;
			System.out.println("Quarter returned");
		}else if (_state == NO_QUARTER) {
			System.out.println("You haven't insert a quarter");
		}else if (_state == SOLD_OUT) {
			System.out.println("You can't eject, you havent't inserted a quarter yet");
		}else if (_state == SOLD){
			System.out.println("Sorry, you already turned the crank!");
		}
	}
	
	public void turnQuarter(){
		if (_state == HAS_QUARTER) {
			System.out.println("You turned ...");
			_state = SOLD;
			dispenseQuarter();
		}else if (_state == NO_QUARTER) {
			System.out.println("You turned but there's no quarter");
		}else if (_state == SOLD_OUT) {
			System.out.println("You turned but there's no gumballs");
		}else if (_state == SOLD){
			System.out.println("Turning twice, doesn't get you another gumball!");
		}
	}
	
	public void dispenseQuarter(){
		if (_state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}else if (_state == NO_QUARTER) {
			System.out.println("No gumball dispensed");
		}else if (_state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		}else if (_state == SOLD){
			System.out.println("A gumball comes rolling out the slot");
			_count--;
			if (_count == 0) {
				System.out.println("Oops, out of gumballs");
				_state = SOLD_OUT;
			}else{
				_state = NO_QUARTER;
			}
		}
	}
}
