package net.nata.pattern.lamda.step1;

import java.text.SimpleDateFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.text.DateFormatter;

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
		
		Function<Long, Boolean> fun2 = (x) -> x == 3L;
	//	log.info("result3 : {}",fun2.apply( 3L));
		
		CustomFunction func3 = (x, y) -> 
										String.valueOf(x*y);
		
		ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(() -> 1);//supplier 타입이므로.
		log.info("result3 : {}",threadLocal.get());
		
		ThreadLocal<DateFormatter> threadLocal2 =ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
		log.info("result4 : {}",threadLocal2.get().toString());
		
		
		JButton button = new JButton();
		button.addActionListener(event -> log.info("task : {}",event.getActionCommand()));
		
		//BinaryOperator add = (x,y) -> x+y;//타입 명시가 되지 않아 컴파일 되지 않음
		log.info("---------------LadaExample2 E N D----------------");
	}
}
