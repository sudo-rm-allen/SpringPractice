package practice2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		//init config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// call methods
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close
		context.close();
		
	}

}
