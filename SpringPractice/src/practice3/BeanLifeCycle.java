package practice3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
		
		//init config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// call methods
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//close

		context.close();
		
	}

}
