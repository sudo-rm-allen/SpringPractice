package practice2;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String list[] = {
			"you're lit",
			"you're dead",
			"you'll have money"
	};
	private Random rand = new Random();
	
	public String getDailyFortune() {
		
		return list[rand.nextInt(3)];
	}

}
