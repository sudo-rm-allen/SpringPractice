package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same bean
		boolean result = (theCoach == alphaCoach);
		
		System.out.print("\nPointing to the same object: "+ result);
		System.out.print("\nMemory location for theCoach: " + theCoach);
		System.out.print("\nMemory location for alphaCoach: " + alphaCoach);
		//close bean
		context.close();
	}

}
