package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for emailaddress and team
	private String emailAddress,team;
	

	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//out setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside fortune setter method");
		this.fortuneService = fortuneService;
	}
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside email setter");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside team setter");
		this.team = team;
	}

	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 16 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
