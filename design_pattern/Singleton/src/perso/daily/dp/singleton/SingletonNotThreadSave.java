package perso.daily.dp.singleton;

public class SingletonNotThreadSave {
	private static SingletonNotThreadSave uniqueInstance;
	private SingletonNotThreadSave(){}
	
	public static SingletonNotThreadSave getInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonNotThreadSave();
		}
		return uniqueInstance;
	}
	/* 
	 * Other methods here ...
	 */
}
