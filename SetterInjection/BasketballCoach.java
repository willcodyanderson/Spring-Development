//Simple Test of Dependency Injection
//@author William Anderson

package com.william.springdemo;

public class BasketballCoach implements Coach {

	FortuneService fortuneService;
	
	
	public BasketballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practiced Dribbling for Over 9000 hours";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "My Basketball Fortune";
	}

}
