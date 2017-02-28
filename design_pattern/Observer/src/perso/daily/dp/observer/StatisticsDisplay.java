package perso.daily.dp.observer;

public class StatisticsDisplay implements DisplayElement, Observer {

	
	public StatisticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Statistics Display");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		display();	
	}

}
