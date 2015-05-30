package observer.javaobservable;

import java.util.Observable;
import java.util.Observer;

import observer.interfaces.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(String.format(
				"Current conditions: %sF degrees and %s humidity", temperature,
				humidity));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) arg0;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();

			display();
		}

	}

}
