package perso.daily.dp.visitor;

public class Body implements Element {
	@Override
	public void accept(Visitor vistor) {
		vistor.visit(this);
	}
	
}
