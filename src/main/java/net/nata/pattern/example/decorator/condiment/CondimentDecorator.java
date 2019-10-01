package net.nata.pattern.example.decorator.condiment;

import net.nata.pattern.example.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
