package net.nata.pattern.example.decorator.condiment.impl;

import net.nata.pattern.example.decorator.Beverage;
import net.nata.pattern.example.decorator.condiment.CondimentDecorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}
