package observer;

import observer.impl.observerImpl.CurrentConditionsDisplay;
import observer.impl.subjectImpl.WeatherData;

public class Scene {

	public static void main(String[] args) {
		Scene o = new Scene();
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 0.4f);
	}

}
