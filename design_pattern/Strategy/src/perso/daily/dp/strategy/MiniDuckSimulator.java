package perso.daily.dp.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new ModelDuck();
		mallard.performFly();
		mallard.performQuack();

		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFly();
	}

}
