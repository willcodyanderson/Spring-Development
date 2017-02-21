//Simple Test of Dependency Injection
//@author William Anderson

package com.william.springdemo;




public class HappyFortuneService implements FortuneService{


	@Override
	public String getDailyFortune() {
		String[] fortuneArray = {"Fortune 1", "Fortune 2","Fortune 3"};
		return fortuneArray[(int)(Math.random() * (3 - 0) + 0)];
	}

}
