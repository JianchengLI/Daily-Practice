package perso.daily.dp.visitor;

public class Wheel implements Element {
	 private String name;
	 
     Wheel(String name) {
         this.setName(name);
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void accept(Visitor vistor) {
		vistor.visit(this);
	}
}
