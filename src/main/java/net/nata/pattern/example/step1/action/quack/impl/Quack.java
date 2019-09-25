package net.nata.pattern.example.step1.action.quack.impl;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.step1.action.quack.QuackBehavior;

@Slf4j
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		log.info("quack ~~~~");
	}

}
