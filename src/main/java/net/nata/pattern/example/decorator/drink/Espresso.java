package net.nata.pattern.example.decorator.drink;

import net.nata.pattern.example.decorator.Beverage;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "에스프레소";
	}
	public double cost() {
		return 1.99;
	}

}
