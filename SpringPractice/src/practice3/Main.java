package practice3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		//init config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// call methods
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean checkIfSame = (theCoach == alphaCoach);
		
		System.out.println("\nthe same:" + checkIfSame);
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("\nmemory location for theCoach:" + theCoach);
		System.out.println("\nmemory location for alphaCoach:" + alphaCoach);
		
		//close

		context.close();
		
	}

}
