package perso.daily.dp.adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		testDuck(duck);
		testDuck(turkeyAdapter);
		
		Turkey duckAdapter = new DuckAdapter(duck);
		testTurkey(turkey);
		testTurkey(duckAdapter);
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
	
	static void testTurkey(Turkey turkey){
		turkey.gobble();
		turkey.fly();
	}

}
