package net.nata.pattern.example.step1;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.example.step1.action.fly.impl.FlyRocketPowered;
import net.nata.pattern.example.step1.impl.MallardDuck;
import net.nata.pattern.example.step1.impl.ModelDuck;
import net.nata.pattern.example.step1.impl.RedheadDuck;

@Slf4j
@Configuration
public class StrategyPatternInit {
	//행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴
	//@PostConstruct
	void init() {
		log.info("-------------------------------");
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		log.info("-------------------------------");
		Duck duck2 = new RedheadDuck();
		duck2.display();
		duck2.performFly();
		duck2.performQuack();
		log.info("-------------------------------");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		log.info("-------------------------------");
	}
}
