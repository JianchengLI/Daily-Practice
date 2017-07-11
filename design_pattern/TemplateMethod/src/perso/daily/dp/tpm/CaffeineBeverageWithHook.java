package perso.daily.dp.tpm;

public abstract class CaffeineBeverageWithHook {
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	public void boilWater(){
		System.out.println("boilWater");
	}
	
	public void pourInCup(){
		System.out.println("pourInCup");
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	boolean customerWantsCondiments(){
		return true; // Hook
	}
}
