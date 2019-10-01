package net.nata.pattern.example.decorator;

public abstract class Beverage {
	public String description = "제목없음";
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
