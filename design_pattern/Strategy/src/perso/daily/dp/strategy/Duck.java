package perso.daily.dp.strategy;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void display(){}
	public void swim(){
		System.out.println("All ducks float, even decoys");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flyBehavior.fly();
	}
}
