package com.design;

import com.design.behavioural.observer.ObserverUsage;
import com.design.structural.decorator.DecoratorUsage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternApplication {

	public static void main(String[] args) {
		DecoratorUsage.execute();
//		ObserverUsage.execute();
//		StrategyUsage.test();
//		BuilderUsage.test();
//		SpringApplication.run(DesignpatternApplication.class, args);
	}

}
