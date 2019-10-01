package net.nata.pattern.example.decorator.drink;

import net.nata.pattern.example.decorator.Beverage;

public class Decaffeination  extends Beverage {
	
	public Decaffeination() {
		description = "디카페인";
	}
	public double cost() {
		return 1.05;
	}

}