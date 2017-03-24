package perso.daily.dp.singleton;

public class SingletonDoubleChecked {
	private volatile static SingletonDoubleChecked uniqueInstance;
	private SingletonDoubleChecked(){}
	
	/**
	 * Problem : If always getInstance, BAD PERFORMANCE !!
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
