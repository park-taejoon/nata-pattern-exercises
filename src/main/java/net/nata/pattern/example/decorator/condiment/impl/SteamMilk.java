package net.nata.pattern.example.decorator.condiment.impl;

import net.nata.pattern.example.decorator.Beverage;
import net.nata.pattern.example.decorator.condiment.CondimentDecorator;

public class SteamMilk extends CondimentDecorator{
	Beverage beverage;
	
	public SteamMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", 스팀밀크";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}

}
