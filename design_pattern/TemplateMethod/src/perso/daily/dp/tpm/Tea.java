package perso.daily.dp.tpm;

public class Tea extends CaffeineBeverage{

	public void steepTeaBag(){
		System.out.println("steepTeaBag");
	}
	
	public void addLemon(){
		System.out.println("addLemon");
	}

	@Override
	public void brew() {
		steepTeaBag();
	}

	@Override
	public void addCondiments() {
		addLemon();
	}
}
