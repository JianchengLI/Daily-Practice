package perso.daily.dp.singleton;

public class SingletonStaticInit {
	private static SingletonStaticInit uniqueInstance = new SingletonStaticInit();
	private SingletonStaticInit(){}
	
	/**
	 * Problem : Eagerly
	 * @return
	 */
	public static SingletonStaticInit getInstance(){
		return uniqueInstance;
	}
	/* 
	 * Other methods here ...
	 */
}
