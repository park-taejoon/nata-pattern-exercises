package net.nata.pattern.example.step1.action.fly.impl;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.step1.action.fly.FlyBehavior;

@Slf4j
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		log.info("im have wings go to fly");
	}

}
