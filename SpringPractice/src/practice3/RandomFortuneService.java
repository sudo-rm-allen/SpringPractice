package practice3;

import java.util.Random;

import practice3.FortuneService;

public class RandomFortuneService implements FortuneService {

	
	private String[] list = {
			"young money",
			"we made it",
			"another one"
	};
	private Random rand = new Random();
	
	@Override
	public String getDailyFortune() {
		
		return list[rand.nextInt(3)];
	}

}
