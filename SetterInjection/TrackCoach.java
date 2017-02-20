//Simple Test of Dependency Injection
//@author William Anderson

package com.william.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Spent 30 minutes in Track Practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "my Track Fortune";
	}

}
