package net.nata.pattern.example.observer.impl;


import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.observer.DisplayElement;
import net.nata.pattern.example.observer.Observer;
import net.nata.pattern.example.observer.Subject;

@Slf4j
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		log.info("Current conditions : {}, F degrees and {} % humidity",this.temperature, this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();

	}

}
