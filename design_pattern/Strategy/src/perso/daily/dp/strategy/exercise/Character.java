package perso.daily.dp.strategy.exercise;

public class Character {
	WeaponBehavior weapon;
	
	public void setWeapon(WeaponBehavior wb){
		weapon = wb;
	}
	public void fight(){
		weapon.useWeapon();
	}
}
