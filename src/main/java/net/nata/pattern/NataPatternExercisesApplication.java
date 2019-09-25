package net.nata.pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import lombok.extern.slf4j.Slf4j;
import net.nata.pattern.db.model.User;
import net.nata.pattern.db.repositorie.UserRepository;
import net.nata.pattern.example.step1.Duck;
import net.nata.pattern.example.step1.action.fly.impl.FlyRocketPowered;
import net.nata.pattern.example.step1.impl.MallardDuck;
import net.nata.pattern.example.step1.impl.ModelDuck;
import net.nata.pattern.example.step1.impl.RedheadDuck;

@Slf4j
@SpringBootApplication
public class NataPatternExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NataPatternExercisesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initData(UserRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new User("jack","Jack@naver.com"));
			repository.save(new User("chloe","Chloe@naver.com"));
			repository.save(new User("kim","Kim@naver.com"));
			repository.save(new User("david","David@naver.com"));
			repository.save(new User("michelle","Michelle@naver.com"));
			
			// fetch all customers
			log.info("user found with findAll():");
			log.info("-------------------------------");
			for (User customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");
		};
	}

	
}
