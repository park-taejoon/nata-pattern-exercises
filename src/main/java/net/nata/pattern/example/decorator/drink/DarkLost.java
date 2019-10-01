package net.nata.pattern.example.decorator.drink;

import net.nata.pattern.example.decorator.Beverage;

public class DarkLost extends Beverage {
	
	public DarkLost() {
		description = "다크로스트";
	}
	public double cost() {
		return .99;
	}

}
