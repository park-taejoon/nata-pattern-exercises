package net.nata.pattern.example.step1.impl;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.step1.Duck;
import net.nata.pattern.example.step1.action.fly.impl.FlyNoWay;
import net.nata.pattern.example.step1.action.quack.impl.Squeak;

@Slf4j
public class RedheadDuck extends Duck{
	public RedheadDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
		
	}
	public void display() {
		log.info("RedheadDuck 입니다.");
	}
}
