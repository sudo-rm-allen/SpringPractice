package practice3;

public class BasketballCoach implements Coach{

	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("inside basketball coach");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "\nMake 100 3 pointers";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

	
	
}
