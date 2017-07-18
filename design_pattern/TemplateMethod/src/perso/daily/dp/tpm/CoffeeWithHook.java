package perso.daily.dp.tpm;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		return answer.toLowerCase().startsWith("y");
	}

	private String getUserInput() {
		String answer = "yes";
		// ...
		return answer;
	}

	
}
