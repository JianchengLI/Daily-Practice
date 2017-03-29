package perso.daily.dp.component;

import java.util.LinkedHashMap;

public class UI {

	public static void main(String[] args) {
		Menu menu = new Menu("Menu1", "", (name)-> {
			LinkedHashMap<String, String>  map = new LinkedHashMap<>();
			if (name == "Menu1") {
				map.put("Menu1Item1", "MenuItem");
				map.put("Menu1Item2", "MenuItem");
				map.put("Menu1Item3", "MenuItem");
				map.put("Menu2", "Menu");
			}
			if (name == "Menu2") {
				map.put("Menu2Item1", "MenuItem");
				map.put("Menu2Item2", "MenuItem");
				map.put("Menu2Item3", "MenuItem");
				map.put("Menu3", "Menu");
			}
			if (name == "Menu3") {
				map.put("Menu3Item1", "MenuItem");
				map.put("Menu3Item2", "MenuItem");
				map.put("Menu3Item3", "MenuItem");
			}
			return map;
		});
		
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
