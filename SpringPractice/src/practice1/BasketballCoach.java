package practice1;

public class BasketballCoach implements Coach{

	
	public BasketballCoach() {
		System.out.println("inside basketball coach");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "\nMake 100 3 pointers";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

	
}