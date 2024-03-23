package com.foodapp.springfoodapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@EnableAsync  //todo for enable -> Thread
public class SpringFoodAppApplication {
// TODO ->https://github.com/Srinu-rj/spring-food-app.git
	public static void main(String[] args){
		SpringApplication.run(SpringFoodAppApplication.class, args);
		System.out.println("SPRING-BOOT-APPLICATION");
	}

}
