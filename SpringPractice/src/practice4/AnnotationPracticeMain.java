package practice4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPracticeMain {

	public static void main(String args[]) {
		
		//load config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext4.xml");
		
		//do soe ting
		
		Coach theCoach = context.getBean("basketballCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		//close
		
		context.close();
	}
	
}
