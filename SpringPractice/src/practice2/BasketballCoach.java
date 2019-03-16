package practice2;

public class BasketballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService theFortuneService) {
		
		System.out.print("inside basketball coach");
		fortuneService = theFortuneService;
	
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Make 100 3 pointers";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

	
}