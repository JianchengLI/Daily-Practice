package perso.daily.dp.visitor;

public class Car implements Element {
	private Engine engin = new Engine();
	private Body body = new Body();
	private Wheel[] wheels = { 
			new Wheel("front left"), 
			new Wheel("front right"), 
			new Wheel("back left"),
			new Wheel("back right") 
	};
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		engin.accept(visitor);
		body.accept(visitor);
		for (int i = 0; i < wheels.length; ++ i)
            wheels[i].accept(visitor);
	}
}
