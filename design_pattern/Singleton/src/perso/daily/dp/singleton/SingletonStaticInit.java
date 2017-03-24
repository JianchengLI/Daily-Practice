package perso.daily.dp.singleton;

public class SingletonStaticInit {
	private static SingletonStaticInit uniqueInstance = new SingletonStaticInit();
	private SingletonStaticInit(){}
	
	/**
	 * Problem : Eagerly, If its a big Instance, RESOURCE PB, Created so early and always here !!
	 * @return
	 */
	public static SingletonStaticInit getInstance(){
		return uniqueInstance;
	}
	/* 
	 * Other methods here ...
	 */
}
