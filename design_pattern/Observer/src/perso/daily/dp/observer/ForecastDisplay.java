package perso.daily.dp.observer;

public class ForecastDisplay implements DisplayElement, Observer {
	
	public ForecastDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Forecast Display");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		display();
	}
}
