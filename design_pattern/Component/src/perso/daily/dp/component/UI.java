package perso.daily.dp.component;

public class UI {
	
	public static void main(String[] args) {
		Menu menu = new Menu("Menu1", "", new DemoMenuProvider());
		
		menu.display();
		menu.onclick(); // click to loading
		menu.onclick();
		menu.display();
		System.out.println("");
		menu.getChildren().ifPresent(children -> children.forEach(e->e.onclick())); // click to loading
		menu.display();
		System.out.println("");
		menu.getChildren().ifPresent(children -> children.forEach(e-> {
			if (e instanceof Menu) {
				e.getChildren().ifPresent(children2 -> children2.forEach(e2 -> e2.onclick())); // click to loading
			}
		}));
		menu.display();
	}

}
