package perso.daily.dp.visitor;

public class Engine implements Element {
	@Override
	public void accept(Visitor vistor) {
		vistor.visit(this);
	}
}
