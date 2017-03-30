package perso.daily.dp.component;

import java.util.LinkedHashMap;

public class DemoMenuProvider implements MenuProviderFunction{

	@Override
	public LinkedHashMap<String, String> initItemsByName(String name) {
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
	}

}
