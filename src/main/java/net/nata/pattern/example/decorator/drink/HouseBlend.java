package net.nata.pattern.example.decorator.drink;

import net.nata.pattern.example.decorator.Beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "하우스 블랜드 커피";
	}
	public double cost() {
		return .89;
	}

}
