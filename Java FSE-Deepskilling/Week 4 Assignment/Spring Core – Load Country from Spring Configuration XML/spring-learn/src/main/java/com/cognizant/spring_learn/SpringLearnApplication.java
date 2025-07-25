package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.entity.Country;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);
		logger.info("inside main");
		displayCountry();
	}
	public static void displayCountry(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country c = context.getBean("country", Country.class);
		logger.debug("Country : {}",c.toString());
	}

}
