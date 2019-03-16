package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	
	private String[] list = {
			"Today is your lucky day!",
			"Today is your worse day",
			"You will get money today"
			};
	
	
	@Override
	public String getFortune() {
		double random = Math.random() * 2;
		
		return list[(int)random];
	}

	
	
	
	
	
}
