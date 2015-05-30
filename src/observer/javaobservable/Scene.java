package observer.javaobservable;

import observer.javaobservable.CurrentConditionsDisplay;
import observer.javaobservable.WeatherData;

public class Scene {
	
	public static void main(String[] args) {
		Scene o = new Scene();
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 0.4f);
	}
}
