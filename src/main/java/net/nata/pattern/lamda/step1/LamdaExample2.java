package net.nata.pattern.lamda.step1;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.lamda.function.CustomFunction;

@Slf4j
@Component
public class LamdaExample2 {
	@PostConstruct
	void init() {
		log.info("---------------LadaExample2 START----------------");
		
		Predicate<Integer> test1 = (x) -> x>5;
		log.info("result1 : {}",test1.test(3) ? "true닷" : "false 닷" );//반환형이 boolean
		
		
		CustomFunction func = (x, y) -> String.valueOf(x*y);
		log.info("result2 : {}",func.init(10L, 3));
		
		//BinaryOperator add = (x,y) -> x+y;//타입 명시가 되지 않아 컴파일 되지 않음
		log.info("---------------LadaExample2 E N D----------------");
	}
}
