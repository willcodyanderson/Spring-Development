package com.william.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for literal value injection
	private String emailAddress;
	private String team;
	
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach - inside no arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach - Within Email Setter method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach - Within Team Setter method");

		this.team = team;
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
