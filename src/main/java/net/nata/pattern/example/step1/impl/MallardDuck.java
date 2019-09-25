package net.nata.pattern.example.step1.impl;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.step1.Duck;
import net.nata.pattern.example.step1.action.fly.impl.FlyWithWings;
import net.nata.pattern.example.step1.action.quack.impl.Quack;

@Slf4j
public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		
	}
	public void display() {
		log.info("MallardDuck 입니다.");
	}
}
