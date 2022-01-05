package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.SpringDemo.Car;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class BeanCreationWithXmlConfigurationApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BeanCreationWithXmlConfigurationApplication.class,
		// args);
		/*Using Application context */		
		//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			/*Using BeanFactory */
		BeanFactory context = new XmlBeanFactory(new ClassPathResource("Applicationcontext.xml"));
		Car car = (Car) context.getBean("car");
		System.out.println(car.getEngineData());
	}

}
