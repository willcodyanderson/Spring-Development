package com.william.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve a bean from the spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close application context
		context.close();
	}

}
