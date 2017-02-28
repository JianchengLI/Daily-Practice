package perso.daily.dp.observer.java.util;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setSeasurements(80, 65, 30.4f);
		weatherData.setSeasurements(82, 70, 32.4f);
		weatherData.setSeasurements(78, 90, 28.2f);
	}

}
