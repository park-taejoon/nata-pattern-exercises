package net.nata.pattern.lamda.step1;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LadaExample1 {
	@PostConstruct
	void init() {
		log.info("---------------LadaExample1 START----------------");
		Runnable noArguments = () -> log.info("noArguments init");
		noArguments.run();
		
		ActionListener oneArgument = g -> log.info("oneArgument init");
		
		Runnable multiStatement = () -> {
			log.info("multiStatement");
			log.info("init");
		};
		multiStatement.run();
		
		BinaryOperator<Long> add = (x,y) -> x+y;//함수 구현.
		log.info("result : {}",add.apply(3L, 4L));
		
		BinaryOperator<Long> addExplicit = (Long x,Long y) -> x-y;//함수 구현.
		log.info("result : {}",addExplicit.apply(3L, 4L));
		log.info("---------------LadaExample1 E N D----------------");
	}
}
