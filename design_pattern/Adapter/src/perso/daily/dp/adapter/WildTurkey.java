package perso.daily.dp.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Goobble gobble~");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
