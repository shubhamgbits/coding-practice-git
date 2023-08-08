package com.designpattern;

import com.designpattern.creational.builder.BuilderUsage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternApplication {

	public static void main(String[] args) {
		BuilderUsage.test();
//		SpringApplication.run(DesignpatternApplication.class, args);
	}

}
