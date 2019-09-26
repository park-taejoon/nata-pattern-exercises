package net.nata.pattern.example.step1;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.step1.action.fly.FlyBehavior;
import net.nata.pattern.example.step1.action.quack.QuackBehavior;

@Slf4j
public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	void swim() {
		log.info("swim");
	};
	public void display() {
		log.info("my name is : {}",this.getClass().getName());
	};
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
 