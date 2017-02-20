package com.william.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach - inside no arg constructor");
	}
	
	//my setter that spring will call upon dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach - Within FortuneService Setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practiced Cricket All Day";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
