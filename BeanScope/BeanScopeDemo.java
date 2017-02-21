package com.william.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {

	//load spring config file
	ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");	
	//get beans from container
	
	Coach firstCoach = context.getBean("myCoach", Coach.class);
	Coach secondCoach = context.getBean("myCoach", Coach.class);
	
	boolean result = (firstCoach == secondCoach);
	
	System.out.println("Same object: " + result);
	
	System.out.println("Memory Location of Coach One: " + firstCoach);
	
	System.out.println("Memory Location of Coach Two: " + secondCoach);
	
	//close context
	
	context.close();
	}

}
