package net.nata.pattern.example.step1.action.fly.impl;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.step1.action.fly.FlyBehavior;

@Slf4j
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		log.info("로켓 추진으로 날아간당~~");
	}

}
