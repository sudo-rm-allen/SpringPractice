package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	//define private field for dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
}
