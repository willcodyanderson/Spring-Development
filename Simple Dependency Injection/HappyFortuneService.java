package com.william.springdemo;




public class HappyFortuneService implements FortuneService{


	@Override
	public String getDailyFortune() {
		
		return "Today is Your Lucky Day";
	}

}
