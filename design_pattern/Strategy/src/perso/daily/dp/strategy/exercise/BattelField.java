package perso.daily.dp.strategy.exercise;

public class BattelField {

	public static void main(String[] args) {
		King king = new King();
		king.fight();
		
		Queen queen = new Queen();
		queen.fight();
		
		king.setWeapon(new AxeBehavior());
		king.fight();
	}

}
