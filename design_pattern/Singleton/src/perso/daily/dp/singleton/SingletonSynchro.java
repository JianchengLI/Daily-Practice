package perso.daily.dp.singleton;

public class SingletonSynchro {
	private static SingletonSynchro uniqueInstance;
	private SingletonSynchro(){}
	
	/**
	 * Problem : If always getInstance, BAD PERFORMANCE !!
	 * @return
	 */
	public static synchronized SingletonSynchro getInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonSynchro();
		}
		return uniqueInstance;
	}
	/* 
	 * Other methods here ...
	 */
}
