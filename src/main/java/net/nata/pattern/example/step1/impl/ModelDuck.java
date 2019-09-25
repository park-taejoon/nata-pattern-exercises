package net.nata.pattern.example.step1.impl;

import net.nata.pattern.example.step1.Duck;
import net.nata.pattern.example.step1.action.fly.impl.FlyNoWay;
import net.nata.pattern.example.step1.action.quack.impl.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
}
