package perso.daily.dp.singleton;

public class SingletonDoubleChecked {
	private volatile static SingletonDoubleChecked uniqueInstance;
	private SingletonDoubleChecked(){}
	
	/**
	 * Problem : >= Java 1.5 So ?... No problems
	 * @return
	 */
	public static  SingletonDoubleChecked getInstance(){
		if (uniqueInstance == null) {
			synchronized (SingletonDoubleChecked.class){
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonDoubleChecked();
				}
			}
		}
		return uniqueInstance;
	}
	/* 
	 * Other methods here ...
	 */
}
