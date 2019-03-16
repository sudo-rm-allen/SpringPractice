package practice3;

public class BasketballCoach implements Coach{

	
	public BasketballCoach() {
		System.out.print("inside basketball coach");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Make 100 3 pointers";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

	
	
}
