package net.nata.pattern.example.decorator.condiment.impl;

import net.nata.pattern.example.decorator.Beverage;
import net.nata.pattern.example.decorator.condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}
