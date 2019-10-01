package net.nata.pattern.example.decorator;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.decorator.condiment.impl.Mocha;
import net.nata.pattern.example.decorator.condiment.impl.Soy;
import net.nata.pattern.example.decorator.condiment.impl.Whip;
import net.nata.pattern.example.decorator.drink.DarkLost;
import net.nata.pattern.example.decorator.drink.Espresso;
import net.nata.pattern.example.decorator.drink.HouseBlend;

@Slf4j
@Component
public class DecoratorConfig {
	@PostConstruct
	void init() {
		Beverage beverage = new Espresso();
		log.info("{}, $ {}",beverage.getDescription(),beverage.cost());
		
		Beverage beverage2 = new DarkLost();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		log.info("{}, $ {}",beverage2.getDescription(),beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		log.info("{}, $ {}",beverage3.getDescription(),beverage3.cost());
		
	}
}
