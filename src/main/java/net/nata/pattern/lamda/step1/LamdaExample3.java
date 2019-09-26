package net.nata.pattern.lamda.step1;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.lamda.model.MusicChapter;

@Slf4j
@Component
public class LamdaExample3 extends MusicChapter{
	@PostConstruct
	void init() {
		log.info("---------------{} START----------------",this.getClass().getTypeName());
		
		
		log.info("---------------{} E N D----------------",this.getClass().getTypeName());
	}
}
