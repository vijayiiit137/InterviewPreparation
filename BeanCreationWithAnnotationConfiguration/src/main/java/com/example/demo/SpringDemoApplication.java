package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.SpringDemo.Car;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		Car car = context.getBean(Car.class);
		System.out.println(car.getEngineData());
	}

}
