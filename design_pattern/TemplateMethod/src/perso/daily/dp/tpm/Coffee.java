package perso.daily.dp.tpm;

public class Coffee extends CaffeineBeverage{
	
	public void brewCoffeeGrinds(){
		System.out.println("brewCoffeeGrinds");
	}
	
	public void addSugarAndMilk(){
		System.out.println("addSugarAndMilk");
	}

	@Override
	public void brew() {
		brewCoffeeGrinds();
		
	}

	@Override
	public void addCondiments() {
		addSugarAndMilk();
		
	}
}
