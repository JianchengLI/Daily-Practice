package perso.daily.dp.singleton;

public class SingletonDoubleCheckLocking {
	private volatile static SingletonDoubleCheckLocking uniqueInstance;
	private SingletonDoubleCheckLocking(){}
	
	/**
	 * Problem : double-checked locking > Java 1.5 So ?... No problems
	 * @return
	 */
	public static  SingletonDoubleCheckLocking getInstance(){
		if (uniqueInstance == null) {
			synchronized (SingletonDoubleCheckLocking.class){
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonDoubleCheckLocking();
				}
			}
		}
		return uniqueInstance;
	}
	/* 
	 * Other methods here ...
	 */
}
