//Simple Test of Dependency Injection
//@author William Anderson

package com.william.springdemo;

public class BaseballCoach implements Coach {

	//define a private field for the dependency 
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spent 30 minutes in Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService
		return fortuneService.getDailyFortune();
	}

}
