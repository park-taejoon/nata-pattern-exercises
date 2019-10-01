package net.nata.pattern.example.observer;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import net.nata.pattern.example.observer.impl.CurrentConditionDisplay;
import net.nata.pattern.example.observer.impl.WeatherData;

@Component
public class ObserverConfig {
	//@PostConstruct
	void init() {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay
							= new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(75, 90, 32.2f);
	}
}
