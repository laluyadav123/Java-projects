package com.lalu.springdemo;

import com.lalu.springdemo.beanscope.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "best of luck for today";
	}

}
