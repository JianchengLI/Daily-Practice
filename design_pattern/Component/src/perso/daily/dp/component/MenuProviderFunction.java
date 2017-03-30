package perso.daily.dp.component;

import java.util.LinkedHashMap;

@FunctionalInterface
public interface MenuProviderFunction {
    public abstract LinkedHashMap<String, String> initItemsByName(String name);
}
